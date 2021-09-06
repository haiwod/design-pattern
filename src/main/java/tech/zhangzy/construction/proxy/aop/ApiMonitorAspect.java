package tech.zhangzy.construction.proxy.aop;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * api监控切面
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/09/06
 */
@Aspect
@Component
@Slf4j
public class ApiMonitorAspect {

    @Pointcut(value = "@annotation(tech.zhangzy.construction.proxy.aop.ApiMonitor)")
    private void pointcut() {
    }

    @Around(value = "pointcut()")
    public Object apiMonitorHandler(ProceedingJoinPoint joinPoint) {
        Object result = null;
        Signature signature = joinPoint.getSignature();
        Method method = ((MethodSignature) signature).getMethod();
        ApiMonitor apiMonitor = method.getAnnotation(ApiMonitor.class);
        String apiName = getApiName(joinPoint);
        String param = getApiParam(joinPoint);
        long startTime = System.currentTimeMillis();
        try {
            log.info("监控API,name:{},param:{}", apiName, param);
            result = joinPoint.proceed();
        } catch (Throwable throwable) {
            exceptionWarn(apiMonitor, joinPoint, throwable);
        }
        long endTime = System.currentTimeMillis();
        timeoutWarn(apiMonitor, joinPoint, endTime - startTime);
        return result;
    }

    /**
     * API名称（类+方法名）
     *
     * @param joinPoint
     * @return
     */
    private String getApiName(ProceedingJoinPoint joinPoint) {
        Object target = joinPoint.getTarget();
        String clzName = target.getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        return clzName + "." + methodName;
    }

    /**
     * API参数
     *
     * @param joinPoint
     * @return
     */
    private String getApiParam(ProceedingJoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        return JSON.toJSONString(args);
    }

    /**
     * 超时告警
     *
     * @param apiMonitor
     * @param joinPoint
     * @param realTime
     */
    private void timeoutWarn(ApiMonitor apiMonitor, ProceedingJoinPoint joinPoint, long realTime) {
        if (apiMonitor.isWarn()) {
            int execTime = apiMonitor.timeout();
            if (realTime > execTime) {
                //接口超时触发告警通知
                WarnNotifyEnum[] warnNotifyEnums = apiMonitor.warnType();
                Arrays.stream(warnNotifyEnums).forEach(notify -> {
                    log.info("------------API超时告警通知:{}--------------", notify.getDesc());
                    log.info("监控API,执行时长:{},阈值:{};name:{},param:{}", realTime, execTime, getApiName(joinPoint), getApiParam(joinPoint));
                });
            }
        }
    }

    /**
     * 异常告警
     *
     * @param apiMonitor
     * @param joinPoint
     * @param throwable
     */
    private void exceptionWarn(ApiMonitor apiMonitor, ProceedingJoinPoint joinPoint, Throwable throwable) {
        //告警开关
        if (apiMonitor.isWarn()) {
            //有异常直接触发告警通知
            WarnNotifyEnum[] warnNotifyEnums = apiMonitor.warnType();
            Arrays.stream(warnNotifyEnums).forEach(notify -> {
                log.info("------------API报错告警通知:{}--------------", notify.getDesc());
                log.info("监控API,name:{},param:{}", getApiName(joinPoint), getApiParam(joinPoint));
                log.info("exception:{}", throwable.getMessage(), throwable);
            });
        }
    }
}

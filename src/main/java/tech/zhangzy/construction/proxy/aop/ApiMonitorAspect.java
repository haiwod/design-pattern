package tech.zhangzy.construction.proxy.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

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
    private void pointcut(){};

    public void apiMonitorHandler(){

    }
}

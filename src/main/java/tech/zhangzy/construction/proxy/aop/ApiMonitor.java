package tech.zhangzy.construction.proxy.aop;

import java.lang.annotation.*;

/**
 * API监控注解
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/09/05
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ApiMonitor {

    /**
     * 告警开关
     */
    boolean isWarn() default true;

    /**
     * 告警错误落库（异步写入）
     */
    boolean isSaveDB() default false;

    /**
     * API执行时长阈值，超过就告警（毫秒）
     */
    int timeout() default 2000;

    /**
     * 告警类型
     *
     * @see WarnNotifyEnum
     */
    WarnNotifyEnum[] warnType() default WarnNotifyEnum.MAIL;

}

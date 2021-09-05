package tech.zhangzy.construction.proxy.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * API监控注解
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/09/05
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiMonitor {

    /**
     * 告警开关
     */
    boolean isWarn() default true;

    /**
     * 日志持久化数据库（异步写入）
     */
    boolean isSaveDB() default false;

    /**
     * API执行时长阈值，超过就告警（毫秒）
     */
    int execTime() default 5000;

    /**
     * 告警类型
     *
     * @see WarnNotifyEnum
     */
    WarnNotifyEnum warnType() default WarnNotifyEnum.MAIL;

}

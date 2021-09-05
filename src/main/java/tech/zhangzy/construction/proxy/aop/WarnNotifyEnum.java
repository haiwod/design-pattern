package tech.zhangzy.construction.proxy.aop;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 告警通知枚举
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/09/06
 */
@AllArgsConstructor
@Getter
public enum WarnNotifyEnum {
    /**
     * 邮箱
     */
    MAIL(1, "邮箱"),
    /**
     * 短信
     */
    MESSAGE(2, "短信"),
    /**
     * 手机
     */
    PHONE(3,"手机");

    private Integer val;

    private String desc;
}

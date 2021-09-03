package tech.zhangzy.behavior.strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

/**
 * 登录类型枚举
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/3
 */
@AllArgsConstructor
@Getter
public enum LoginTypeEnum {
    /**
     * 微信登录
     */
    WE_CHAT(1, "微信登录"),
    /**
     * 普通登录
     */
    COMMON(2, "普通登录");


    private Integer val;

    private String desc;

    public static LoginTypeEnum getLoginTypeEnum(Integer val) {
        return Arrays.stream(LoginTypeEnum.values()).filter(type -> type.getVal().equals(val)).findFirst().orElseThrow(
                () -> new RuntimeException("枚举值映射错误")
        );
    }
}

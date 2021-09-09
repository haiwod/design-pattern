package tech.zhangzy.construction.facade;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

/**
 * 服务类型枚举
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/3
 */
@AllArgsConstructor
@Getter
public enum ServiceTypeEnum {
    /**
     * 微信服务
     */
    WE_CHAT(1, "微信服务"),
    /**
     * 会员服务
     */
    CRM_MEMBER(2, "会员");


    private Integer val;

    private String desc;

    public static ServiceTypeEnum getLoginTypeEnum(Integer val) {
        return Arrays.stream(ServiceTypeEnum.values()).filter(type -> type.getVal().equals(val)).findFirst().orElseThrow(
                () -> new RuntimeException("枚举值映射错误")
        );
    }
}

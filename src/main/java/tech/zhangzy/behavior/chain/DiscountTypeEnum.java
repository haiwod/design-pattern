package tech.zhangzy.behavior.chain;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 优惠券类型枚举
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/3
 */
@AllArgsConstructor
@Getter
public enum DiscountTypeEnum {
    /**
     * 三折券
     */
    THREE_DISCOUNT(1, "三折"),
    /**
     * 满减券
     */
    REDUCE_DISCOUNT(2, "满减券");


    private Integer val;

    private String desc;
}

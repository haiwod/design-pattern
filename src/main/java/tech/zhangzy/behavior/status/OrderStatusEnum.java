package tech.zhangzy.behavior.status;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 订单状态枚举
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/9
 */
@Getter
@AllArgsConstructor
public enum OrderStatusEnum {
    /**
     * 新建订单
     */
    NEW_ORDER(1, "新建订单"),
    /**
     * 待支付
     */
    WAIT_PAY(2, "待支付"),
    /**
     * 已支付
     */
    PAYED(3, "已支付"),
    /**
     * 制作中
     */
    PRODUCING(4,"后台制作"),
    /**
     * 订单结束
     */
    END_ORDER(5,"订单结束");

    private Integer val;

    private String desc;
}

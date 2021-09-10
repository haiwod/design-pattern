package tech.zhangzy.behavior.status;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

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
    PRODUCING(4, "后台制作"),
    /**
     * 订单完成
     */
    END_ORDER(5, "订单完成"),
    /**
     * 取消订单
     */
    CANCEL_ORDER(6, "订单取消");

    private Integer val;

    private String desc;

    public static OrderStatusEnum getOrderStatusEnum(Integer val) {
        return Arrays.stream(OrderStatusEnum.values()).filter(type -> type.getVal().equals(val)).findFirst().orElseThrow(
                () -> new RuntimeException("枚举值映射错误")
        );
    }
}

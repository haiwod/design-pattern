package tech.zhangzy.behavior.state.base;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;

/**
 * 订单状态枚举
 *
 * @author zhangzy
 * @date 2022/05/14
 * @since 1.8
 */
@Getter
@AllArgsConstructor
public enum OrderStateEnum {

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
     * 配送中
     */
    DELIVERING(5, "配送中"),
    /**
     * 订单完成
     */
    SUCCESS(5, "订单完成"),
    /**
     * 订单关闭
     */
    CLOSE(6, "订单关闭");

    private final Integer code;

    private final String desc;

    public static OrderStateEnum getOrderStatusEnum(Integer val) {
        return Arrays.stream(OrderStateEnum.values()).filter(type -> type.getCode().equals(val)).findFirst().orElseThrow(
                () -> new RuntimeException("枚举值映射错误")
        );
    }
}

package tech.zhangzy.behavior.state;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.zhangzy.behavior.state.base.OrderStateEnum;

/**
 * 订单信息简略版
 *
 * @author zhangzy
 * @date 2022/05/15
 * @since 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfo {
    private String orderId;

    private Integer orderState;

    public static OrderInfo build() {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setOrderId(String.valueOf(System.currentTimeMillis()));
        orderInfo.setOrderState(OrderStateEnum.WAIT_PAY.getCode());
        return orderInfo;
    }
}

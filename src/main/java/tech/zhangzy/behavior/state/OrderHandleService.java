package tech.zhangzy.behavior.state;

import org.springframework.stereotype.Service;
import tech.zhangzy.behavior.state.base.OrderStateEnum;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 模拟订单服务
 *
 * @author zhangzy
 * @date 2022/05/14
 * @since 1.8
 */
@Service
public class OrderHandleService {
    private final static Map<String, OrderInfo> ORDER_INFO_MAP = new ConcurrentHashMap<>();

    public OrderInfo createOrder() {
        OrderInfo orderInfo = OrderInfo.build();
        ORDER_INFO_MAP.put(orderInfo.getOrderId(), orderInfo);
        return orderInfo;
    }

    public synchronized void updateState(String orderId, OrderStateEnum currentState, OrderStateEnum afterState) {
        if (orderId == null) {
            throw new IllegalArgumentException("orderId is not null");
        }
        OrderInfo orderInfo = ORDER_INFO_MAP.get(orderId);
        if (!currentState.getCode().equals(orderInfo.getOrderState())) {
            throw new RuntimeException("订单状态已更新，更改状态操作失败");
        }
        orderInfo.setOrderState(afterState.getCode());
        ORDER_INFO_MAP.put(orderId, orderInfo);
    }
}

package tech.zhangzy.behavior.state;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tech.zhangzy.Application;
import tech.zhangzy.behavior.state.base.OrderStateEnum;


/**
 * 状态模式测试
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/9
 */
@SpringBootTest(classes = Application.class)
@Slf4j
class OrderStatusTest {
    @Autowired
    OrderHandleContext orderHandleContext;

    @Test
    void test() {
        //创建待支付订单
        OrderInfo orderInfo = orderHandleContext.createOrder();
        //订单支付
        orderHandleContext.pay(orderInfo.getOrderId(),OrderStateEnum.WAIT_PAY);
        //商家接单
        orderHandleContext.merchantReceive(orderInfo.getOrderId(),OrderStateEnum.PAYED);
        //配送接单
        orderHandleContext.deliveryReceive(orderInfo.getOrderId(),OrderStateEnum.PRODUCING);
        //配送到达，订单完成
        orderHandleContext.arrived(orderInfo.getOrderId(),OrderStateEnum.DELIVERING);
    }
}
package tech.zhangzy.behavior.state.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import tech.zhangzy.behavior.state.OrderResult;
import tech.zhangzy.behavior.state.OrderHandleService;
import tech.zhangzy.behavior.state.base.BaseOrderState;
import tech.zhangzy.behavior.state.base.OrderStateEnum;

import javax.annotation.Resource;

/**
 * 未支付状态下的操作
 *
 * @author zhangzy
 * @date 2022/05/14
 * @since 1.8
 */
@Slf4j
@Component
public class WaitPayOrderState extends BaseOrderState {
    @Resource
    private OrderHandleService orderhandleService;

    @Override
    public OrderResult pay(String orderId) {
        log.info("当前订单:{},状态:{}", orderId, OrderStateEnum.WAIT_PAY.getDesc());
        try {
            orderhandleService.updateState(orderId, OrderStateEnum.WAIT_PAY, OrderStateEnum.PAYED);
        } catch (Exception ex) {
            log.warn("当前订单:{},支付失败", orderId, ex);
            return new OrderResult("0011", "支付失败");
        }
        log.info("当前订单:{},支付成功，状态:{}", orderId, OrderStateEnum.PAYED.getDesc());
        return new OrderResult("0010", "支付成功");
    }

    @Override
    public OrderResult cancel(String orderId) {
        log.info("当前订单:{},状态:{}", orderId, OrderStateEnum.WAIT_PAY.getDesc());
        try {
            orderhandleService.updateState(orderId, OrderStateEnum.WAIT_PAY, OrderStateEnum.CLOSE);
        } catch (Exception ex) {
            log.warn("当前订单:{},取消失败", orderId, ex);
            return new OrderResult("0021", "取消失败");
        }
        log.info("当前订单:{},取消成功，状态:{}", orderId, OrderStateEnum.CLOSE.getDesc());
        return new OrderResult("0020", "取消成功");
    }

    @Override
    public OrderStateEnum getEnum() {
        return OrderStateEnum.WAIT_PAY;
    }
}

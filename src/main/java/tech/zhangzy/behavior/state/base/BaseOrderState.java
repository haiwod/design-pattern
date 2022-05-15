package tech.zhangzy.behavior.state.base;

import tech.zhangzy.behavior.state.OrderResult;

/**
 * 状态基类
 *
 * @author zhangzy
 * @date 2022/05/14
 * @since 1.8
 */
public abstract class BaseOrderState implements OrderState {

    @Override
    public OrderResult pay(String orderId) {
        throw new RuntimeException("支付失败，当前状态不允许操作");
    }

    @Override
    public OrderResult cancel(String orderId) {
        throw new RuntimeException("取消失败，当前状态不允许操作");
    }

    @Override
    public OrderResult merchantReceive(String orderId) {
        throw new RuntimeException("商家接单失败，当前状态不允许操作");
    }

    @Override
    public OrderResult deliveryReceive(String orderId) {
        throw new RuntimeException("配送接单失败，当前状态不允许操作");
    }

    @Override
    public OrderResult arrived(String orderId) {
        throw new RuntimeException("配送到达失败，当前状态不允许操作");
    }

    public abstract OrderStateEnum getEnum();
}

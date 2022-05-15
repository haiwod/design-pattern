package tech.zhangzy.behavior.state.base;

import tech.zhangzy.behavior.state.OrderResult;

/**
 * 订单状态接口类，列出每个状态可能操作的行为
 *
 * @author zhangzy
 * @date 2022/05/14
 * @see OrderStateEnum 状态枚举
 * @since 1.8
 */
public interface OrderState {
    /**
     * 支付
     *
     * @param orderId
     * @return
     */
    OrderResult pay(String orderId);

    /**
     * 取消
     *
     * @param orderId
     * @return
     */
    OrderResult cancel(String orderId);

    /**
     * 商家接单
     *
     * @param orderId
     * @return
     */
    OrderResult merchantReceive(String orderId);

    /**
     * 配送接单
     *
     * @param orderId
     * @return
     */
    OrderResult deliveryReceive(String orderId);

    /**
     * 配送到达
     *
     * @param orderId
     * @return
     */
    OrderResult arrived(String orderId);

}

package tech.zhangzy.behavior.status.state;

import tech.zhangzy.behavior.status.OrderStatusEnum;

/**
 * 订单状态处理基类
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/9
 */
public abstract class OrderStatusService {
    /**
     * 新建订单
     *
     * @param orderNo
     */
    public abstract void newOrder(String orderNo);

    /**
     * 待支付
     *
     * @param orderNo
     */
    public abstract void waitPay(String orderNo);

    /**
     * 已支付
     *
     * @param orderNo
     */
    public abstract void payed(String orderNo);

    /**
     * 制作中
     *
     * @param orderNo
     */
    public abstract void producing(String orderNo);

    /**
     * 订单完成
     *
     * @param orderNo
     */
    public abstract void endOrder(String orderNo);

    /**
     * 取消订单
     *
     * @param orderNo
     */
    public abstract void cancelOrder(String orderNo);

    /**
     * 订单状态
     * @return
     */
    public abstract OrderStatusEnum getStatus();
}

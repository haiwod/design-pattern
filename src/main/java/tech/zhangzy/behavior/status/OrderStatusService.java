package tech.zhangzy.behavior.status;

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
     * @param currentStatus
     */
    public abstract void newOrder(String orderNo, OrderStatusEnum currentStatus);

    /**
     * 待支付
     *
     * @param orderNo
     * @param currentStatus
     */
    public abstract void waitPay(String orderNo, OrderStatusEnum currentStatus);

    /**
     * 已支付
     *
     * @param orderNo
     * @param currentStatus
     */
    public abstract void payed(String orderNo, OrderStatusEnum currentStatus);

    /**
     * 制作中
     *
     * @param orderNo
     * @param currentStatus
     */
    public abstract void producing(String orderNo, OrderStatusEnum currentStatus);

    /**
     * 订单结束
     *
     * @param orderNo
     * @param currentStatus
     */
    public abstract void endOrder(String orderNo, OrderStatusEnum currentStatus);

    /**
     * 当前状态
     *
     * @return
     */
    public abstract OrderStatusEnum getOrderStatusEnum();
}

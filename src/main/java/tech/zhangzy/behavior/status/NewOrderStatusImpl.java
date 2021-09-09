package tech.zhangzy.behavior.status;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 新建订单状态处理
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/9
 */
@Component
@Slf4j
public class NewOrderStatusImpl extends OrderStatusService {
    @Override
    public void newOrder(String orderNo, OrderStatusEnum currentStatus) {
        log.info("订单号:{},当前状态:{}", orderNo, currentStatus.getDesc());
        log.info("-----------订单处理中------------");
    }

    @Override
    public void waitPay(String orderNo, OrderStatusEnum currentStatus) {
        log.info("订单号:{},当前状态:{}", orderNo, currentStatus.getDesc());
        log.info("-----------订单无法处理------------");
    }

    @Override
    public void payed(String orderNo, OrderStatusEnum currentStatus) {
        log.info("订单号:{},当前状态:{}", orderNo, currentStatus.getDesc());
        log.info("-----------订单无法处理------------");
    }

    @Override
    public void producing(String orderNo, OrderStatusEnum currentStatus) {
        log.info("订单号:{},当前状态:{}", orderNo, currentStatus.getDesc());
        log.info("-----------订单无法处理------------");
    }

    @Override
    public void endOrder(String orderNo, OrderStatusEnum currentStatus) {
        log.info("订单号:{},当前状态:{}", orderNo, currentStatus.getDesc());
        log.info("-----------订单无法处理------------");
    }

    @Override
    public OrderStatusEnum getOrderStatusEnum() {
        return OrderStatusEnum.NEW_ORDER;
    }
}

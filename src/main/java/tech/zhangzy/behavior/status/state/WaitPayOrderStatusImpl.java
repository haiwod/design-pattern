package tech.zhangzy.behavior.status.state;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import tech.zhangzy.behavior.status.OrderStatusEnum;

/**
 * 未支付订单状态处理
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/10
 */
@Component
@Slf4j
public class WaitPayOrderStatusImpl extends OrderStatusService {

    @Override
    public void newOrder(String orderNo) {
        log.info("------订单号:{},当前状态:{}-------", orderNo, getStatus().getDesc());
        log.info("------------订单无法处理----------------");
    }

    @Override
    public void waitPay(String orderNo) {
        log.info("------订单号:{},当前状态:{}-------", orderNo, getStatus().getDesc());
        log.info("------------订单已支付处理中----------------");
        log.info("------订单号:{},变更状态:{}-------", orderNo, OrderStatusEnum.PAYED.getDesc());
    }

    @Override
    public void payed(String orderNo) {
        log.info("------订单号:{},当前状态:{}-------", orderNo, getStatus().getDesc());
        log.info("------------订单无法处理----------------");
    }

    @Override
    public void producing(String orderNo) {
        log.info("------订单号:{},当前状态:{}-------", orderNo, getStatus().getDesc());
        log.info("------------订单无法处理----------------");
    }

    @Override
    public void endOrder(String orderNo) {
        log.info("------订单号:{},当前状态:{}-------", orderNo, getStatus().getDesc());
        log.info("------------订单无法处理----------------");
    }

    @Override
    public void cancelOrder(String orderNo) {
        log.info("------订单号:{},当前状态:{}-------", orderNo, getStatus().getDesc());
        log.info("------------订单取消处理中----------------");
        log.info("------订单号:{},变更状态:{}-------", orderNo, OrderStatusEnum.CANCEL_ORDER.getDesc());
    }

    @Override
    public OrderStatusEnum getStatus() {
        return OrderStatusEnum.WAIT_PAY;
    }
}

package tech.zhangzy.behavior.state.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import tech.zhangzy.behavior.state.OrderResult;
import tech.zhangzy.behavior.state.OrderHandleService;
import tech.zhangzy.behavior.state.base.BaseOrderState;
import tech.zhangzy.behavior.state.base.OrderStateEnum;

import javax.annotation.Resource;

/**
 * 制作状态下的操作
 *
 * @author zhangzy
 * @date 2022/05/15
 * @since 1.8
 */
@Slf4j
@Component
public class ProducingOrderState extends BaseOrderState {
    @Resource
    private OrderHandleService orderhandleService;

    @Override
    public OrderResult deliveryReceive(String orderId) {
        log.info("当前订单:{},状态:{}", orderId, OrderStateEnum.PRODUCING.getDesc());
        try {
            orderhandleService.updateState(orderId, OrderStateEnum.PRODUCING, OrderStateEnum.DELIVERING);
        } catch (Exception ex) {
            log.warn("当前订单:{},配送接单失败", orderId, ex);
            return new OrderResult("0041", "配送接单失败");
        }
        log.info("当前订单:{},配送接单成功，状态:{}", orderId, OrderStateEnum.DELIVERING.getDesc());
        return new OrderResult("0040", "配送接单成功");
    }

    @Override
    public OrderStateEnum getEnum() {
        return OrderStateEnum.PRODUCING;
    }
}

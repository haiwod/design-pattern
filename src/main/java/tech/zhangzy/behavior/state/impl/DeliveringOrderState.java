package tech.zhangzy.behavior.state.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import tech.zhangzy.behavior.state.OrderResult;
import tech.zhangzy.behavior.state.OrderHandleService;
import tech.zhangzy.behavior.state.base.BaseOrderState;
import tech.zhangzy.behavior.state.base.OrderStateEnum;

import javax.annotation.Resource;

/**
 * 配送中状态下的操作
 *
 * @author zhangzy
 * @date 2022/05/15
 * @since 1.8
 */
@Slf4j
@Component
public class DeliveringOrderState extends BaseOrderState {
    @Resource
    private OrderHandleService orderhandleService;
    @Override
    public OrderResult arrived(String orderId) {
        log.info("当前订单:{},状态:{}", orderId, OrderStateEnum.DELIVERING.getDesc());
        try {
            orderhandleService.updateState(orderId, OrderStateEnum.DELIVERING, OrderStateEnum.SUCCESS);
        } catch (Exception ex) {
            log.warn("当前订单:{},配送失败", orderId, ex);
            return new OrderResult("0051", "配送失败");
        }
        log.info("当前订单:{},配送成功，状态:{}", orderId, OrderStateEnum.SUCCESS.getDesc());
        return new OrderResult("0050", "配送成功");
    }

    @Override
    public OrderStateEnum getEnum() {
        return OrderStateEnum.DELIVERING;
    }
}

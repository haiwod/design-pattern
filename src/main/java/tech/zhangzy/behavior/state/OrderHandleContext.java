package tech.zhangzy.behavior.state;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import tech.zhangzy.behavior.state.base.BaseOrderState;
import tech.zhangzy.behavior.state.base.OrderStateEnum;

import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 订单操作上下文
 *
 * @author zhangzy
 * @date 2022/05/15
 * @since 1.8
 */
@Component
public class OrderHandleContext implements InitializingBean, ApplicationContextAware {

    private static final Map<OrderStateEnum, BaseOrderState> ORDER_STATE_MACHINE = new ConcurrentHashMap<>();
    @Resource
    private OrderHandleService orderhandleService;

    public OrderInfo createOrder(){
        return orderhandleService.createOrder();
    }
    /**
     * 支付订单
     *
     * @param orderId
     * @param currentState
     * @return
     */
    public OrderResult pay(String orderId, OrderStateEnum currentState) {
        return ORDER_STATE_MACHINE.get(currentState).pay(orderId);
    }

    /**
     * 取消订单
     *
     * @param orderId
     * @param currentState
     * @return
     */
    public OrderResult cancel(String orderId, OrderStateEnum currentState) {
        return ORDER_STATE_MACHINE.get(currentState).cancel(orderId);
    }

    /**
     * 商家接单
     *
     * @param orderId
     * @param currentState
     * @return
     */
    public OrderResult merchantReceive(String orderId, OrderStateEnum currentState) {
        return ORDER_STATE_MACHINE.get(currentState).merchantReceive(orderId);
    }

    /**
     * 配送接单
     *
     * @param orderId
     * @param currentState
     * @return
     */
    public OrderResult deliveryReceive(String orderId, OrderStateEnum currentState) {
        return ORDER_STATE_MACHINE.get(currentState).deliveryReceive(orderId);
    }

    /**
     * 配送送达
     *
     * @param orderId
     * @param currentState
     * @return
     */
    public OrderResult arrived(String orderId, OrderStateEnum currentState) {
        return ORDER_STATE_MACHINE.get(currentState).arrived(orderId);
    }

    @Override
    public void afterPropertiesSet() {
        applicationContext.getBeansOfType(BaseOrderState.class).values().forEach(state -> {
            ORDER_STATE_MACHINE.put(state.getEnum(), state);
        });
    }

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}

package tech.zhangzy.behavior.status;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import tech.zhangzy.behavior.status.state.OrderStatusService;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 订单状态流转处理上下文
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/9
 */
@Component
@Slf4j
public class OrderContext implements InitializingBean, ApplicationContextAware {

    private static final Map<OrderStatusEnum, OrderStatusService> ORDER_STATUS_SERVICE_MAP = new ConcurrentHashMap<>();

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @Override
    public void afterPropertiesSet() {
        applicationContext.getBeansOfType(OrderStatusService.class).values().forEach(bean -> {
            ORDER_STATUS_SERVICE_MAP.put(bean.getStatus(), bean);
        });
    }

    public void newOrder(String orderNo, OrderStatusEnum currentStatus) {
        ORDER_STATUS_SERVICE_MAP.get(currentStatus).newOrder(orderNo);
    }

    public void waitPay(String orderNo, OrderStatusEnum currentStatus) {
        ORDER_STATUS_SERVICE_MAP.get(currentStatus).waitPay(orderNo);
    }

    public void payed(String orderNo, OrderStatusEnum currentStatus) {
        ORDER_STATUS_SERVICE_MAP.get(currentStatus).payed(orderNo);

    }

    public void producing(String orderNo, OrderStatusEnum currentStatus) {
        ORDER_STATUS_SERVICE_MAP.get(currentStatus).producing(orderNo);
    }

    public void endOrder(String orderNo, OrderStatusEnum currentStatus) {
        ORDER_STATUS_SERVICE_MAP.get(currentStatus).endOrder(orderNo);
    }

    public void cancelOrder(String orderNo, OrderStatusEnum currentStatus) {
        ORDER_STATUS_SERVICE_MAP.get(currentStatus).cancelOrder(orderNo);
    }
}

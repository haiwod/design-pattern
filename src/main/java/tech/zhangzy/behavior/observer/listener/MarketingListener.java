package tech.zhangzy.behavior.observer.listener;

/**
 * 营销活动监听器
 *
 * @author zhangzy
 * @date 2022/05/21
 * @since 1.8
 */
public interface MarketingListener {
    /**
     * 用户参与活动触发
     *
     * @param event 营销活动事件
     */
    void handle(MarketingEvent event);

    /**
     * 营销活动启动
     *
     * @param event 营销活动事件
     */
    void initialize(MarketingEvent event);

    /**
     * 营销活动结束
     *
     * @param event 营销活动事件
     */
    void destroy(MarketingEvent event);
}

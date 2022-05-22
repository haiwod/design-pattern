package tech.zhangzy.behavior.observer.listener;

import java.util.ArrayList;
import java.util.List;

/**
 * 营销活动管理中心（事件源-->Subject）
 *
 * @author zhangzy
 * @date 2022/05/22
 * @since 1.8
 */
public class MarketingActivitySupport {

    private final List<MarketingListener> listeners = new ArrayList<>();

    public boolean registerListener(MarketingListener listener) {
        if (listeners.contains(listener)) {
            return false;
        }
        return listeners.add(listener);
    }

    public void triggerListener(MarketingEvent event) {
        listeners.forEach(listener -> listener.handle(event));
    }

    public void triggerMarketingInit(MarketingEvent event) {
        listeners.forEach(listener -> listener.initialize(event));
    }

    public void triggerMarketingDestroy(MarketingEvent event) {
        listeners.forEach(listener -> listener.destroy(event));
    }
}

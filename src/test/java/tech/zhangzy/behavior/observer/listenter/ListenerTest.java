package tech.zhangzy.behavior.observer.listenter;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import tech.zhangzy.behavior.observer.listener.InviteNewListener;
import tech.zhangzy.behavior.observer.listener.LotteryListener;
import tech.zhangzy.behavior.observer.listener.MarketingActivitySupport;
import tech.zhangzy.behavior.observer.listener.MarketingEvent;

import java.util.HashMap;
import java.util.Map;

/**
 * （观察者模式）监听器测试
 *
 * @author zhangzy
 * @date 2022/05/22
 * @since 1.8
 */
@Slf4j
class ListenerTest {

    @Test
    void test() {
        // 注册监听器
        MarketingActivitySupport marketingActivitySupport = new MarketingActivitySupport();
        marketingActivitySupport.registerListener(new InviteNewListener());
        marketingActivitySupport.registerListener(new LotteryListener());

        // 营销活动开始
        Map<String, Object> eventMap = new HashMap<>();
        eventMap.put("userId", "10001");
        eventMap.put("price", "50.00");
        MarketingEvent event = MarketingEvent.builder()
                .eventType(MarketingEvent.EventType.INVITE_NEW)
                .eventInfo(eventMap)
                .build();

        // 营销事件开始
        event.start();
        marketingActivitySupport.triggerMarketingInit(event);
        // 用户参与活动
        event.userInvoke();
        marketingActivitySupport.triggerListener(event);
        // 营销事件结束
        event.end();
        marketingActivitySupport.triggerMarketingDestroy(event);

    }
}

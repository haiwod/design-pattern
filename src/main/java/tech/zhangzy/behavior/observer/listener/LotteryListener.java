package tech.zhangzy.behavior.observer.listener;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

/**
 * 抽奖活动监听器（事件监听器-->observer）
 *
 * @author zhangzy
 * @date 2022/05/22
 * @since 1.8
 */
@Slf4j
public class LotteryListener implements MarketingListener {
    @Override
    public void handle(MarketingEvent event) {
        if (event.getEventType().equals(MarketingEvent.EventType.LOTTERY)) {
            // 抽奖活动
            log.info("用户:{}, 成功参与抽奖活动 ！！", Optional.ofNullable(event.getEventInfo().get("userId")).orElse("null"));
        }
    }

    @Override
    public void initialize(MarketingEvent event) {
        if (event.getEventType().equals(MarketingEvent.EventType.LOTTERY)) {
            // 抽奖活动开启
            log.info("MarketingEvent:{}, info:{}, started", event.getEventType(), JSON.toJSONString(event.getEventInfo()));
        }
    }

    @Override
    public void destroy(MarketingEvent event) {
        if (event.getEventType().equals(MarketingEvent.EventType.LOTTERY)) {
            // 抽奖活动结束
            log.info("MarketingEvent:{}, info:{}, destroy", event.getEventType(), JSON.toJSONString(event.getEventInfo()));
        }
    }
}

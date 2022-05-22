package tech.zhangzy.behavior.observer.listener;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

/**
 * 邀新活动监听器（事件监听器-->observer）
 *
 * @author zhangzy
 * @date 2022/05/21
 * @since 1.8
 */
@Slf4j
public class InviteNewListener implements MarketingListener {

    @Override
    public void handle(MarketingEvent event) {
        if (event.getEventType().equals(MarketingEvent.EventType.INVITE_NEW)) {
            // 用户邀新
            log.info("用户:{}, 成功参与邀新活动 ！！", Optional.ofNullable(event.getEventInfo().get("userId")).orElse("null"));
        }
    }

    @Override
    public void initialize(MarketingEvent event) {
        if (event.getEventType().equals(MarketingEvent.EventType.INVITE_NEW)) {
            // 邀请活动启动
            log.info("MarketingEvent:{}, info:{}, started", event.getEventType(), JSON.toJSONString(event.getEventInfo()));
        }
    }

    @Override
    public void destroy(MarketingEvent event) {
        if (event.getEventType().equals(MarketingEvent.EventType.INVITE_NEW)) {
            // 邀新活动结束
            log.info("MarketingEvent:{}, info:{}, destroy", event.getEventType(), JSON.toJSONString(event.getEventInfo()));
        }
    }
}

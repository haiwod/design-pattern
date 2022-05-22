package tech.zhangzy.behavior.observer.listener;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.Optional;

/**
 * 营销事件
 *
 * @author zhangzy
 * @date 2022/05/21
 * @since 1.8
 */
@Data
@Builder
@Slf4j
public class MarketingEvent {
    private EventType eventType;

    private Map<String, Object> eventInfo;

    @AllArgsConstructor
    public enum EventType {
        /**
         * 邀新活动
         */
        INVITE_NEW(1),
        /**
         * 抽奖
         */
        LOTTERY(2);

        private final int code;

    }

    public void start() {
        log.info("marketing activity start!!");
    }

    public void userInvoke() {
        String userId = (String) Optional.ofNullable(eventInfo.get("userId")).orElseThrow(() -> new RuntimeException("no user invoke, userId is null"));
        log.info("userId:{} invoke activity", userId);
    }

    public void end() {
        log.info("marketing activity over!!");
    }

}

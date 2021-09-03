package tech.zhangzy.behavior.template;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 自营平台工单回调处理
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/3
 */
@Slf4j
@Component
public class SelfPlatformTicketCallback extends AbstractTicketCallback {
    @Override
    protected TicketTypeEnum getTicketTypeEnum() {
        return TicketTypeEnum.SELF_PLATFORM;
    }

    @Override
    protected void completeTicket(Map<String, String> orderInfo, CallbackParam param) {
        log.info("-------补充自营平台工单字段-------");
    }
}

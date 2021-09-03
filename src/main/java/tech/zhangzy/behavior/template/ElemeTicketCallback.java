package tech.zhangzy.behavior.template;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 饿了么工单回调处理
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/3
 */
@Slf4j
@Component
public class ElemeTicketCallback extends AbstractTicketCallback{
    @Override
    protected TicketTypeEnum getTicketTypeEnum() {
        return TicketTypeEnum.ELEME;
    }

    @Override
    protected void completeTicket(Map<String, String> orderInfo, CallbackParam param) {
        log.info("-------补充饿了么工单字段-------");

    }
}

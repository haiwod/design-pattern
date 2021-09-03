package tech.zhangzy.behavior.template;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 美团工单回调处理
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/3
 */
@Slf4j
@Component
public class MeituanTicketCallback extends AbstractTicketCallback{

    @Override
    protected TicketTypeEnum getTicketTypeEnum() {
        return TicketTypeEnum.MEITUAN;
    }

    @Override
    protected void completeTicket(Map<String, String> orderInfo, CallbackParam param) {
        log.info("-------补充美团工单字段-------");

    }
}

package tech.zhangzy.behavior.template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/**
 * 工单回调处理工厂类
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/3
 */
@Component
public class TicketCallbackHandlerFactory {
    private static final Map<TicketTypeEnum, AbstractTicketCallback> TICKET_HANDLER_MAP = new EnumMap<>(TicketTypeEnum.class);

    @Autowired
    public void setTicketHandlerMap(List<AbstractTicketCallback> list) {
        list.forEach(handler -> TICKET_HANDLER_MAP.put(handler.getTicketTypeEnum(), handler));
    }

    public AbstractTicketCallback getTicketCallback(TicketTypeEnum ticketTypeEnum) {
        return TICKET_HANDLER_MAP.get(ticketTypeEnum);
    }

}

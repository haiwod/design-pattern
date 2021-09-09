package tech.zhangzy.construction.facade;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 对微信推送消息
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/9
 */
@Service
@Slf4j
public class WeChatMessagePushImpl implements IMessagePush {

    @Override
    public boolean push(String msg) {
        log.info("------------开始推送消息---------------");
        log.info("service:{},msg:{}", getServiceType().getDesc(), msg);
        return true;
    }

    @Override
    public ServiceTypeEnum getServiceType() {
        return ServiceTypeEnum.WE_CHAT;
    }
}

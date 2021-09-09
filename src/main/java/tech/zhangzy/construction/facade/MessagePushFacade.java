package tech.zhangzy.construction.facade;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * 消息推送中心
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/9
 */
@Component
@Slf4j
public class MessagePushFacade {
    @Autowired
    private List<IMessagePush> pushServiceList;

    public void push(MessageParam param) {
        List<Integer> pushList = param.getPushService();
        if (CollectionUtils.isEmpty(pushList)) {
            log.warn("msgId:{},推送系统为空", param.getMsgId());
            return;
        }
        for (Integer sys : pushList) {
            pushServiceList.stream()
                    .filter(item -> item.getServiceType().getVal().equals(sys))
                    .findFirst()
                    .ifPresent(item -> item.push(param.getMsgContent()));
        }
    }
}

package tech.zhangzy.behavior.observer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * 消费者
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/10
 */
@Getter
@Setter
@AllArgsConstructor
@Slf4j
public class TopicConsumer {

    private String ip;

    private String name;

    public void consume(Message msg) {
        log.info("ip:{},name:{}------接收msg:{}", ip, name, msg.toString());
        log.info("------------消费消息成功---------------");
    }

}

package tech.zhangzy.behavior.observer;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 观察者模式测试
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/10
 */
@Slf4j
class TopicMessageTest {

    @Test
    void test() {
        //模拟监听会员消费情况主题
        CustomTopic topic = new CustomTopic("crm-member-consume-state");
        topic.addConsumer(new TopicConsumer("192.168.0.1","会员系统"));
        topic.addConsumer(new TopicConsumer("192.168.0.2","营销系统"));

        Message msg = new Message();
        msg.setMsgId("202109101517001");
        Map<String, String> content = new HashMap<>();
        content.put("memberId","29974891");
        content.put("amount","6773.63");
        msg.setContent(JSON.toJSONString(content));
        msg.setTime(new Date());
        topic.notifyConsumer(msg);

    }
}
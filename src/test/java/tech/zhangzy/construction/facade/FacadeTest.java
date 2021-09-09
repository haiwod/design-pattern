package tech.zhangzy.construction.facade;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tech.zhangzy.Application;

import java.util.Arrays;

/**
 * API告警监控测试
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/6
 */
@SpringBootTest(classes = Application.class)
@Slf4j
class FacadeTest {

    @Autowired
    MessagePushFacade messagePushFacade;

    @Test
    void test(){
        MessageParam param=new MessageParam();
        param.setMsgContent("xxxx下单成功");
        param.setPushService(Arrays.asList(1,2));
        param.setMsgId("20210909001");
        messagePushFacade.push(param);
    }
}
package tech.zhangzy.behavior.template;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tech.zhangzy.Application;

/**
 * 模板模式方法测试
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/3
 */
@SpringBootTest(classes = Application.class)
@Slf4j
class TicketCallbackTest {
    @Autowired
    TicketCallbackHandlerFactory factory;

    @Test
    void templateTest() {
        CallbackParam param = new CallbackParam();
        AbstractTicketCallback self = factory.getTicketCallback(TicketTypeEnum.SELF_PLATFORM);
        self.callbackHandler(param);
    }
}

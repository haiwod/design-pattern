package tech.zhangzy.behavior.status;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tech.zhangzy.Application;
import tech.zhangzy.behavior.pipeline.VerifyEventEnum;
import tech.zhangzy.behavior.pipeline.context.IdentityContext;
import tech.zhangzy.behavior.pipeline.context.VerifyContext;
import tech.zhangzy.behavior.pipeline.executor.AbstractVerifyExecutor;

import java.util.List;
import java.util.Map;


/**
 * 状态模式测试
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/9
 */
@SpringBootTest(classes = Application.class)
@Slf4j
class OrderStatusTest {
    @Autowired
    OrderContext orderContext;

    @Test
    void test() {
        //处理订单为新建状态
        orderContext.newOrder("20210909100",OrderStatusEnum.NEW_ORDER);
    }
}
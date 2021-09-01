package tech.zhangzy.behavior.pipeline;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tech.zhangzy.Application;
import tech.zhangzy.behavior.pipeline.context.IdentityContext;
import tech.zhangzy.behavior.pipeline.context.VerifyContext;
import tech.zhangzy.behavior.pipeline.executor.AbstractVerifyExecutor;

import java.util.List;
import java.util.Map;


/**
 * 管道模式测试
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/1
 */
@SpringBootTest(classes = Application.class)
@Slf4j
class VerifyTest {
    @Autowired
    Map<VerifyEventEnum, List<AbstractVerifyExecutor>> verifyEventChainMap;

    @Test
    void test() {
        VerifyContext context = new IdentityContext();
        context.setUserId("20210901001");
        //校验下单事件风控
        log.info("----------下单风控开始---------");
        List<AbstractVerifyExecutor> orderVerifyChain = verifyEventChainMap.get(VerifyEventEnum.ORDER);
        orderVerifyChain.forEach(executor -> executor.verify(context));
        log.info("----------下单风控结束---------");
        //校验登录事件风控
        log.info("----------登录风控开始---------");
        List<AbstractVerifyExecutor> loginVerifyChain = verifyEventChainMap.get(VerifyEventEnum.LOGIN);
        loginVerifyChain.forEach(executor -> executor.verify(context));
        log.info("----------登录风控结束---------");
    }
}
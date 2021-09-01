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
    List<AbstractVerifyExecutor<? extends VerifyContext>> verifyChain;

    @Test
    void test() {
        VerifyContext context = new IdentityContext();
        context.setUserId("20210901001");
        verifyChain.stream().forEach(item ->
                log.info(item.getVerifyType().getDesc())
        );
        for (AbstractVerifyExecutor verifyExecutor : verifyChain) {
            verifyExecutor.verify(context);
        }
    }
}
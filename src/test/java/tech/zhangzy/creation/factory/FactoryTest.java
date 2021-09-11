package tech.zhangzy.creation.factory;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tech.zhangzy.Application;
import tech.zhangzy.behavior.pipeline.context.VerifyContext;
import tech.zhangzy.behavior.pipeline.executor.AbstractVerifyExecutor;
import tech.zhangzy.behavior.pipeline.executor.VerifyTypeEnum;
import tech.zhangzy.behavior.strategy.LoginStrategy;
import tech.zhangzy.behavior.strategy.LoginTypeEnum;
import tech.zhangzy.behavior.strategy.LoginVerifyParam;
import tech.zhangzy.construction.facade.MessageParam;
import tech.zhangzy.construction.facade.MessagePushFacade;

import java.util.Arrays;

/**
 * 工厂模式测试
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/6
 */
@SpringBootTest(classes = Application.class)
@Slf4j
class FactoryTest {

    @Autowired
    StrategyFactory<VerifyTypeEnum, AbstractVerifyExecutor> verifyExecutorFactory;
    @Autowired
    StrategyFactory<LoginTypeEnum, LoginStrategy> loginStrategyFactory;

    @Test
    void factoryMethodTest(){
        VerifyContext context = new VerifyContext();
        context.setUserId("200991033");
        verifyExecutorFactory.getStrategy(VerifyTypeEnum.IDENTITY).verify(context);
        log.info("--------------------");
        verifyExecutorFactory.getStrategy(VerifyTypeEnum.PAY).verify(context);
        log.info("--------------------");


        LoginVerifyParam loginVerifyParam = new LoginVerifyParam();
        loginVerifyParam.setLoginType(1);
        loginStrategyFactory.getStrategy(LoginTypeEnum.WE_CHAT).login(loginVerifyParam);
        log.info("--------------------");
        loginVerifyParam.setLoginType(2);
        loginStrategyFactory.getStrategy(LoginTypeEnum.COMMON).login(loginVerifyParam);
    }
}
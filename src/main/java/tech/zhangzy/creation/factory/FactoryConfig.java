package tech.zhangzy.creation.factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.zhangzy.behavior.pipeline.executor.AbstractVerifyExecutor;
import tech.zhangzy.behavior.pipeline.executor.VerifyTypeEnum;
import tech.zhangzy.behavior.strategy.LoginStrategy;
import tech.zhangzy.behavior.strategy.LoginTypeEnum;

/**
 * 工厂类配置
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/11
 */
@Configuration
public class FactoryConfig {

    /**
     * 风控校验执行器工厂
     *
     * @return
     */
    @Bean
    public StrategyFactory<VerifyTypeEnum, AbstractVerifyExecutor> verifyExecutorFactory() {
        return new StrategyFactory<>(AbstractVerifyExecutor.class);
    }

    /**
     * 登录策略工厂
     *
     * @return
     */
    @Bean
    public StrategyFactory<LoginTypeEnum, LoginStrategy> loginStrategyFactory() {
        return new StrategyFactory<>(LoginStrategy.class);
    }
}

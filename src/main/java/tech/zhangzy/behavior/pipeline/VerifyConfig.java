package tech.zhangzy.behavior.pipeline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.zhangzy.behavior.pipeline.context.VerifyContext;
import tech.zhangzy.behavior.pipeline.executor.AbstractVerifyExecutor;
import tech.zhangzy.behavior.pipeline.executor.VerifyTypeEnum;

import java.util.EnumMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 风控配置
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/1
 */
@Configuration
public class VerifyConfig {
    /**
     * 风控类型->对应执行器
     */
    private static final EnumMap<VerifyTypeEnum, AbstractVerifyExecutor<? extends VerifyContext>> VERIFY_EXECUTOR_MAP = new EnumMap<>(VerifyTypeEnum.class);

    @Autowired
    public void setVerifyMap(List<AbstractVerifyExecutor<? extends VerifyContext>> executors) {
        executors.forEach(executor -> VERIFY_EXECUTOR_MAP.put(executor.getVerifyType(), executor));
    }

    @Bean("verifyChain")
    public List<? extends AbstractVerifyExecutor<? extends VerifyContext>> getVerifyChain() {
        //从数据库还是缓存中获取 链路配置
        //先身份校验，再支付校验
        List<AbstractVerifyExecutor<? extends VerifyContext>> verifyChain = new LinkedList<>();
        verifyChain.add(VERIFY_EXECUTOR_MAP.get(VerifyTypeEnum.PAY));
        verifyChain.add(VERIFY_EXECUTOR_MAP.get(VerifyTypeEnum.IDENTITY));
        return verifyChain;
    }
}

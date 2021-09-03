package tech.zhangzy.behavior.pipeline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.zhangzy.behavior.pipeline.executor.AbstractVerifyExecutor;
import tech.zhangzy.behavior.pipeline.executor.VerifyTypeEnum;

import java.util.*;

/**
 * 风控配置
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/1
 */
@Configuration
public class VerifyConfig {
    /**
     * 风控类型->风控执行器
     */
    private static final EnumMap<VerifyTypeEnum, AbstractVerifyExecutor> VERIFY_EXECUTOR_MAP = new EnumMap<>(VerifyTypeEnum.class);

    @Autowired
    public void setVerifyMap(List<AbstractVerifyExecutor> executors) {
        executors.forEach(executor -> VERIFY_EXECUTOR_MAP.put(executor.getVerifyType(), executor));
    }

    /**
     * 风控事件->风控执行器链路
     */
    @Bean("verifyEventChainMap")
    public Map<VerifyEventEnum, List<AbstractVerifyExecutor>> getVerifyChainMap() {
        //从数据库还是缓存中获取，风控事件对应的执行器链路配置
        EnumMap<VerifyEventEnum, List<AbstractVerifyExecutor>> verifyEventChainMap = new EnumMap<>(VerifyEventEnum.class);
        //下单事件 风控逻辑：1.支付校验，2.身份校验
        List<AbstractVerifyExecutor> orderVerifyChain = new ArrayList<>();
        orderVerifyChain.add(VERIFY_EXECUTOR_MAP.get(VerifyTypeEnum.PAY));
        orderVerifyChain.add(VERIFY_EXECUTOR_MAP.get(VerifyTypeEnum.IDENTITY));
        //登录事件 风控逻辑：1.身份校验，2.支付校验
        List<AbstractVerifyExecutor> loginVerifyChain = new ArrayList<>();
        loginVerifyChain.add(VERIFY_EXECUTOR_MAP.get(VerifyTypeEnum.IDENTITY));
        loginVerifyChain.add(VERIFY_EXECUTOR_MAP.get(VerifyTypeEnum.PAY));
        //注册事件 风控逻辑：1.身份校验
        List<AbstractVerifyExecutor> registerVerifyChain = new ArrayList<>();
        registerVerifyChain.add(VERIFY_EXECUTOR_MAP.get(VerifyTypeEnum.IDENTITY));
        registerVerifyChain.add(VERIFY_EXECUTOR_MAP.get(VerifyTypeEnum.PAY));

        verifyEventChainMap.put(VerifyEventEnum.ORDER, orderVerifyChain);
        verifyEventChainMap.put(VerifyEventEnum.LOGIN, loginVerifyChain);
        verifyEventChainMap.put(VerifyEventEnum.REGISTER, registerVerifyChain);
        return verifyEventChainMap;
    }
}

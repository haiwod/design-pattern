package tech.zhangzy.behavior.pipeline.executor;

import tech.zhangzy.behavior.pipeline.context.VerifyContext;
import tech.zhangzy.creation.factory.Strategy;

/**
 * 风控校验接口
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/1
 */
public interface AbstractVerifyExecutor extends Strategy<VerifyTypeEnum> {
    /**
     * 策略的key
     *
     * @return
     */
    @Override
    default VerifyTypeEnum getKey() {
        return getVerifyType();
    }

    /**
     * 风控校验方法
     *
     * @param context
     */
    void verify(VerifyContext context);

    /**
     * 风控类型
     *
     * @return VerifyTypeEnum
     */
    VerifyTypeEnum getVerifyType();
}

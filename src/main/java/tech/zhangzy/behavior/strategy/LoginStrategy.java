package tech.zhangzy.behavior.strategy;

import tech.zhangzy.creation.factory.Strategy;

/**
 * 登录策略
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/3
 */
public interface LoginStrategy extends Strategy<LoginTypeEnum> {
    /**
     * 策略的key
     *
     * @return
     */
    @Override
    default LoginTypeEnum getKey(){
        return getLoginType();
    }

    /**
     * 登录校验
     * @param param
     * @return
     */
    boolean login(LoginVerifyParam param);

    /**
     * 登录类型
     * @return
     */
    LoginTypeEnum getLoginType();
}

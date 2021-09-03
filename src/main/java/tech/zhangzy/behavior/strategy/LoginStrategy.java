package tech.zhangzy.behavior.strategy;

/**
 * 登录接口
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/3
 */
public interface LoginStrategy {
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

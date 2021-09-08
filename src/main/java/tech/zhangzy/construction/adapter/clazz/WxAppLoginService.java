package tech.zhangzy.construction.adapter.clazz;

/**
 * 微信小程序登录接口
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/8
 */
public interface WxAppLoginService {
    /**
     * 小程序登录校验接口
     *
     * @param phone
     * @param verificationCode
     * @return
     */
    Boolean login(String phone, String verificationCode);
}

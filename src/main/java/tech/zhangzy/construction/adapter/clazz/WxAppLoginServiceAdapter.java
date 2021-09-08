package tech.zhangzy.construction.adapter.clazz;

import lombok.extern.slf4j.Slf4j;

/**
 * 微信登录适配器（将已有的单点登录校验接口，适配成微信小程序登录校验）
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/8
 */
@Slf4j
public class WxAppLoginServiceAdapter extends SsoLoginServiceImpl implements WxAppLoginService {

    @Override
    public Boolean login(String phone, String verificationCode) {
        log.info("-----------微信登录校验开始：phone:{},verificationCode:{}----------", phone, verificationCode);
        super.loginVerify("WX_APP", phone + verificationCode);
        log.info("-----------微信登录校验通过----------");
        return true;
    }
}

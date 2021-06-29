package tech.zhangzy.construction.adapter;

/**
 * 类适配模式
 * 对LoginServiceImpl适配成ILoginSrc接口实现
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/6/29
 */
public class WeChatLoginAdapter extends LoginServiceImpl implements ILoginSrc {
    @Override
    public Boolean login(String phone, String verificationCode) {
        return super.loginVerify("weChat", "verificationCode");
    }
}

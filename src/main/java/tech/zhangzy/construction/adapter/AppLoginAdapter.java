package tech.zhangzy.construction.adapter;

/**
 * 对象适配模式
 * 对LoginServiceImpl适配成ILoginSrc接口实现
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/6/29
 */
public class AppLoginAdapter implements ILoginSrc {
    /**
     * 对象适配 组合方式
     */
    private ILoginService iLoginService=new LoginServiceImpl();



    @Override
    public Boolean login(String phone, String verificationCode) {
        //模拟app校验逻辑
        return iLoginService.loginVerify("app", "4545");
    }
}

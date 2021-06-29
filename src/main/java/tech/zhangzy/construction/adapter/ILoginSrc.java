package tech.zhangzy.construction.adapter;

/**
 * 客户端需要的校验接口
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/6/29
 */
public interface ILoginSrc {
    /**
     * app校验接口
     * @param phone
     * @param verificationCode
     * @return
     */
    Boolean login(String phone,String verificationCode);
}

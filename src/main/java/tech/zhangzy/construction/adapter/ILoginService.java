package tech.zhangzy.construction.adapter;

/**
 * 登录校验接口
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/6/29
 */
public interface ILoginService {
    /**
     * 登录统一认证逻辑
     * @param type
     * @param content
     * @return
     */
    Boolean loginVerify(String type, String content);
}

package tech.zhangzy.construction.adapter.clazz;

/**
 * 单点登录统一服务
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/8
 */
public interface SsoLoginService {
    /**
     * 登录统一认证逻辑
     * @param type
     * @param content
     * @return
     */
    Boolean loginVerify(String type, String content);
}

package tech.zhangzy.construction.adapter.api;

/**
 * 微信服务相关接口
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/8
 */
public interface WxService {

    boolean login();

    boolean register();

    String getOpenId();

    String wxUserInfo();

    boolean bind();
}

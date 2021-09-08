package tech.zhangzy.construction.adapter.api;

/**
 * 抽象微信服务基类（空实现全部接口）
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/8
 */
public abstract class AbstractWxApi implements WxService {
    @Override
    public boolean login() {
        return false;
    }

    @Override
    public boolean register() {
        return false;
    }

    @Override
    public String getOpenId() {
        return null;
    }

    @Override
    public String wxUserInfo() {
        return null;
    }

    @Override
    public boolean bind() {
        return false;
    }
}

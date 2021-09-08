package tech.zhangzy.construction.adapter.api;

import lombok.extern.slf4j.Slf4j;

/**
 * 微信服务接口适配（实现需要的微信接口）
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/8
 */
@Slf4j
public class WxServiceAdapter extends AbstractWxApi {

    @Override
    public boolean login() {
        log.info("---------模拟微信登录---------");
        return true;
    }

    @Override
    public boolean register() {
        log.info("---------模拟微信注册---------");
        return true;
    }
}

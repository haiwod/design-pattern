package tech.zhangzy.construction.adapter.clazz;

import lombok.extern.slf4j.Slf4j;

/**
 * 单点登录统一认证逻辑
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/8
 */
@Slf4j
public class SsoLoginServiceImpl implements SsoLoginService {

    @Override
    public Boolean loginVerify(String type, String content) {
        //模拟校验
        log.info("单点登录校验，type={}，content={}", type, content);
        log.info("-----------单点登录校验通过----------");
        return true;
    }
}

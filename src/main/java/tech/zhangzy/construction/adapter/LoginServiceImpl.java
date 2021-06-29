package tech.zhangzy.construction.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * 登录统一认证逻辑
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/6/29
 */
@Slf4j
public class LoginServiceImpl implements ILoginService {

    @Override
    public Boolean loginVerify(String type, String content) {
        //模拟校验
        log.info("【登录校验，type={}，content={}】", type, content);
        return true;
    }
}

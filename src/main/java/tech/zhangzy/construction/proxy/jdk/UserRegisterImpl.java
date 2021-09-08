package tech.zhangzy.construction.proxy.jdk;

import lombok.extern.slf4j.Slf4j;

/**
 * 用户注册
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/8
 */
@Slf4j
public class UserRegisterImpl implements IUserRegister {

    @Override
    public boolean register() {
        log.info("---------用户注册---------");
        return true;
    }
}

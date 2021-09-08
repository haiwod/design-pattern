package tech.zhangzy.construction.proxy.jdk;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * jdk动态代理
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/6
 */
@Slf4j
class JDKProxyTest {

    @Test
    void test() {
        UserVerifyHandler userVerifyHandler = new UserVerifyHandler(new UserRegisterImpl());
        IUserRegister proxy = (IUserRegister) userVerifyHandler.createProxy();
        proxy.register();
    }
}
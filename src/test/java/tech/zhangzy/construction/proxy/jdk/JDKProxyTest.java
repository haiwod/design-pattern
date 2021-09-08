package tech.zhangzy.construction.proxy.jdk;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tech.zhangzy.Application;
import tech.zhangzy.construction.proxy.aop.OrderService;

/**
 * jdk动态代理
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/6
 */
@SpringBootTest(classes = Application.class)
@Slf4j
class JDKProxyTest {

    @Test
    void test() {
        UserVerifyHandler userVerifyHandler = new UserVerifyHandler(new UserRegisterImpl());
        IUserRegister proxy = (IUserRegister) userVerifyHandler.createProxy();
        proxy.register();
    }
}
package tech.zhangzy.construction.proxy.cglib;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import tech.zhangzy.Application;
import tech.zhangzy.construction.proxy.jdk.IUserRegister;
import tech.zhangzy.construction.proxy.jdk.UserRegisterImpl;
import tech.zhangzy.construction.proxy.jdk.UserVerifyHandler;

/**
 * cglib动态代理
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/6
 */
@SpringBootTest(classes = Application.class)
@Slf4j
class CglibProxyTest {

    @Test
    void test() {
        PayVerifyInterceptor payVerifyInterceptor = new PayVerifyInterceptor(new MemberService());
        MemberService proxy = (MemberService) payVerifyInterceptor.createProxy();
        proxy.pay("18859983999","18859983991","4500.50");
    }
}
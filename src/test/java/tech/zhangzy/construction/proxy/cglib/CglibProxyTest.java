package tech.zhangzy.construction.proxy.cglib;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * cglib动态代理
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/6
 */
@Slf4j
class CglibProxyTest {

    @Test
    void test() {
        PayVerifyInterceptor payVerifyInterceptor = new PayVerifyInterceptor(new MemberService());
        MemberService proxy = (MemberService) payVerifyInterceptor.createProxy();
        proxy.pay("18859983999","18859983991","4500.50");
    }
}
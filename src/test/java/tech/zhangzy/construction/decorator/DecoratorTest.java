package tech.zhangzy.construction.decorator;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import tech.zhangzy.Application;
import tech.zhangzy.construction.bridge.*;

/**
 * 装饰器模式测试
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/6
 */
@SpringBootTest(classes = Application.class)
@Slf4j
class DecoratorTest {

    @Test
    void clientTest() {
        //包装了金额风控、用户风控多功能的支付宝支付
        IThirdPay aliPay = new UserVerifyDecorator(new AmountVerifyDecorator(new AliPayService()));
        aliPay.pay("20210907100","4000");

        //包装了用户风控的微信支付
        IThirdPay wxPay = new UserVerifyDecorator(new WeChatPayService());
        aliPay.pay("20210907001","4000");

    }
}
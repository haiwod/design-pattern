package tech.zhangzy.behavior.chain;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import tech.zhangzy.Application;

import javax.annotation.Resource;

/**
 * 责任链模式测试
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/8/31
 */
@SpringBootTest(classes = Application.class)
@Slf4j
class DiscountHandlerChainTest {

    @Resource
    DiscountHandlerChain handlerChain;

    @Test
    void handler() {
        DiscountContext context = new DiscountContext();
        //三折优惠
        context.setCouponType(1);
        handlerChain.handler(context);
    }
}
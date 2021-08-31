package tech.zhangzy.behavior.chain;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import tech.zhangzy.Application;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

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
        List<Integer> coupons = Arrays.asList(2);
        context.setCoupons(coupons);
        handlerChain.handler(context);
    }
}
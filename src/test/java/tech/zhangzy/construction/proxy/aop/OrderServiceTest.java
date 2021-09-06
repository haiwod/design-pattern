package tech.zhangzy.construction.proxy.aop;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tech.zhangzy.Application;

import static org.junit.jupiter.api.Assertions.*;

/**
 * API告警监控测试
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/6
 */
@SpringBootTest(classes = Application.class)
@Slf4j
class OrderServiceTest {

    @Autowired
    OrderService orderService;

    @Test
    void orderTimeout() {
        orderService.orderTimeout();
    }

    @Test
    void orderEx() {
        orderService.orderEx();
    }
}
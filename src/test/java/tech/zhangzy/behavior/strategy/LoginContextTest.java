package tech.zhangzy.behavior.strategy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tech.zhangzy.Application;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 策略模式测试
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/3
 */
@SpringBootTest(classes = Application.class)
@Slf4j
class LoginContextTest {
    @Autowired
    LoginContext loginContext;

    @Test
    void handler() {
        LoginVerifyParam param = new LoginVerifyParam();
        param.setLoginType(1);
        loginContext.handler(param);
    }
}
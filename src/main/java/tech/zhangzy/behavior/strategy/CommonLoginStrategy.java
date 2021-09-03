package tech.zhangzy.behavior.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 常规登录策略，用户名密码
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/3
 */
@Component
@Slf4j
public class CommonLoginStrategy implements LoginStrategy {
    @Override
    public boolean login(LoginVerifyParam param) {
        log.info("-------常规登录校验成功-------");
        return true;
    }

    @Override
    public LoginTypeEnum getLoginType() {
        return LoginTypeEnum.COMMON;
    }
}

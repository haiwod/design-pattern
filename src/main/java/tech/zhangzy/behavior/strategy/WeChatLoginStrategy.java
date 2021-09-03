package tech.zhangzy.behavior.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 微信授权登录策略
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/3
 */
@Component
@Slf4j
public class WeChatLoginStrategy implements LoginStrategy {
    @Override
    public boolean login(LoginVerifyParam param) {
        log.info("-------微信授权登录校验成功-------");
        return true;
    }

    @Override
    public LoginTypeEnum getLoginType() {
        return LoginTypeEnum.WE_CHAT;
    }
}

package tech.zhangzy.construction.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * 对接微信支付服务
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/7
 */
@Slf4j
public class WeChatPayService implements IThirdPay {
    @Override
    public boolean pay(String userId, String amount) {
        log.info("---------微信支付开始---------");
        log.info("---------userId:{},amount:{}---------", userId, amount);
        log.info("---------微信支付结束---------");
        return true;
    }
}

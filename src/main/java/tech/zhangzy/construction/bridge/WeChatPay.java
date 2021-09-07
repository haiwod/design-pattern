package tech.zhangzy.construction.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * 微信支付
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/7
 */
@Slf4j
public class WeChatPay extends AbstractThirdPay {

    public WeChatPay(IPayVerify payVerify) {
        super(payVerify);
    }

    @Override
    protected void transfer(String userId, String amount) {
        log.info("---------微信支付开始---------");
        payVerify.verify();
        log.info("---------userId:{},amount:{}---------", userId, amount);
        log.info("---------微信支付结束---------");
    }
}

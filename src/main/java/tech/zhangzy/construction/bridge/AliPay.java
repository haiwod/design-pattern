package tech.zhangzy.construction.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * 支付宝支付
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/7
 */
@Slf4j
public class AliPay extends AbstractThirdPay{

    public AliPay(IPayVerify payVerify) {
        super(payVerify);
    }

    @Override
    protected void transfer(String userId, String amount) {
        log.info("---------支付宝支付开始---------");
        payVerify.verify();
        log.info("---------userId:{},amount:{}---------", userId, amount);
        log.info("---------支付宝支付结束---------");
    }
}

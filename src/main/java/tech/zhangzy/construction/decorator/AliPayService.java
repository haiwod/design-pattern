package tech.zhangzy.construction.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * 对接支付宝支付服务
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/7
 */
@Slf4j
public class AliPayService implements IThirdPay {
    @Override
    public boolean pay(String userId, String amount) {
        log.info("---------支付宝支付开始---------");
        log.info("---------userId:{},amount:{}---------", userId, amount);
        log.info("---------支付宝支付结束---------");
        return true;
    }
}

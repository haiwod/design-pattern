package tech.zhangzy.construction.decorator;

/**
 * 三方支付接口
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/7
 */
public interface IThirdPay {
    /**
     * 支付
     *
     * @param userId
     * @param amount
     * @return
     */
    boolean pay(String userId, String amount);
}

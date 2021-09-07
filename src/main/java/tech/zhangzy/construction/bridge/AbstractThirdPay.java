package tech.zhangzy.construction.bridge;


/**
 * 抽象支付基类
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/7
 */
public abstract class AbstractThirdPay {
    protected IPayVerify payVerify;

    public AbstractThirdPay(IPayVerify payVerify) {
        this.payVerify = payVerify;
    }

    /**
     * 转账接口
     *
     * @param userId
     * @param amount
     */
    protected abstract void transfer(String userId, String amount);
}

package tech.zhangzy.construction.decorator;


/**
 * 装饰器基类（后续增加功能继承基类）
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/7
 */
public abstract class ThirdPayDecorator implements IThirdPay {

    protected IThirdPay thirdPay;

    public ThirdPayDecorator(IThirdPay thirdPay){
        this.thirdPay = thirdPay;
    }

    @Override
    public abstract boolean pay(String userId, String amount);

}

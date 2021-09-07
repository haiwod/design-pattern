package tech.zhangzy.construction.decorator;


import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * 金额风控功能类
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/7
 */
@Slf4j
public class AmountVerifyDecorator extends ThirdPayDecorator {

    private static final BigDecimal MAX_AMOUNT = new BigDecimal("5000.00");

    public AmountVerifyDecorator(IThirdPay thirdPay) {
        super(thirdPay);
    }

    @Override
    public boolean pay(String userId, String amount) {
        //对金额进行校验
        verify(amount);
        return thirdPay.pay(userId, amount);
    }

    private void verify(String amount) {
        BigDecimal verifyAmount = new BigDecimal(amount);
        if (MAX_AMOUNT.compareTo(verifyAmount) > 0) {
            log.info("---------转账金额风控通过---------");
            return;
        }
        throw new RuntimeException("转账金额过大");
    }
}

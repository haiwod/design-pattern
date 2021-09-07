package tech.zhangzy.construction.decorator;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 金额风控功能类
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/7
 */
@Slf4j
public class UserVerifyDecorator extends ThirdPayDecorator {

    private static final Map<String, String> BLACK_USER_MAP = new ConcurrentHashMap<>();

    static {
        BLACK_USER_MAP.put("20210907001", "user1");
        BLACK_USER_MAP.put("20210907002", "user2");
        BLACK_USER_MAP.put("20210907003", "user3");
    }

    public UserVerifyDecorator(IThirdPay thirdPay) {
        super(thirdPay);
    }

    @Override
    public boolean pay(String userId, String amount) {
        //对转账用户进行校验
        verify(userId);
        return thirdPay.pay(userId, amount);
    }

    private void verify(String userId) {
        String name = BLACK_USER_MAP.get(userId);
        if (Strings.isBlank(name)) {
            log.info("---------转账用户风控通过---------");
            return;
        }
        throw new RuntimeException("该用户在风控中");
    }
}

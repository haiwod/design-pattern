package tech.zhangzy.construction.proxy.cglib;

import lombok.extern.slf4j.Slf4j;

/**
 * 会员服务
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/8
 */
@Slf4j
public class MemberService {

    public void pay(String fromAccountId, String toAccountId, String amount) {
        log.info("-----------支付服务开始------------");
        log.info("支付方ID:{},收款方ID:{},金额:{}", fromAccountId, toAccountId, amount);
        log.info("-----------支付服务结束------------");
    }
}

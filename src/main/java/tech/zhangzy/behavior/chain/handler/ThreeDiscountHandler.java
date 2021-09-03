package tech.zhangzy.behavior.chain.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import tech.zhangzy.behavior.chain.DiscountContext;
import tech.zhangzy.behavior.chain.DiscountTypeEnum;

/**
 * 三折优惠券处理器
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/8/31
 */
@Slf4j
@Component
public class ThreeDiscountHandler implements DiscountHandler {

    @Override
    public boolean execute(DiscountContext context) {
        if (DiscountTypeEnum.THREE_DISCOUNT.getVal().equals(context.getCouponType())) {
            log.info("----三折优惠---");
            return true;
        }
        return false;
    }
}

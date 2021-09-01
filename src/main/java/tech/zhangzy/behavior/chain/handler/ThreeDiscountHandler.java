package tech.zhangzy.behavior.chain.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import tech.zhangzy.behavior.chain.DiscountContext;

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
    public Boolean execute(DiscountContext context) {
        if(context.getCouponType() == 1){
            log.info("----三折优惠---");
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}

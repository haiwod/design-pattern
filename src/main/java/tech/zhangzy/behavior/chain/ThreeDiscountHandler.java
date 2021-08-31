package tech.zhangzy.behavior.chain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 三折优惠券处理器
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/8/31
 */
@Slf4j
@Component
public class ThreeDiscountHandler extends DiscountHandler {

    @Override
    protected Boolean execute(DiscountContext context) {
        if(context.getCouponType() == 1){
            log.info("----三折优惠---");
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}

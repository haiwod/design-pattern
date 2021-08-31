package tech.zhangzy.behavior.chain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

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
        List<Integer> coupons = context.getCoupons();
        if(coupons.contains(2)){
            log.info("----三折优惠---");
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}

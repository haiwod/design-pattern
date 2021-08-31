package tech.zhangzy.behavior.chain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 满减活动处理器
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/8/31
 */
@Slf4j
@Component
public class ReduceDiscountHandler extends DiscountHandler {

    @Override
    protected Boolean execute(DiscountContext context) {
        List<Integer> coupons = context.getCoupons();
        if (coupons.contains(1) ){
            log.info("----满减优惠---");
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}

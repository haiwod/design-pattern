package tech.zhangzy.behavior.chain;

import lombok.Data;

import java.util.List;

/**
 * 折扣信息上下文
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/8/31
 */
@Data
public class DiscountContext {
    /**
     * 原价
     */
    private double price;
    /**
     * 优惠券类型集合
     */
    private List<Integer> coupons;
}

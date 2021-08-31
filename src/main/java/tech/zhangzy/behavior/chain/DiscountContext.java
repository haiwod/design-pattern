package tech.zhangzy.behavior.chain;

import lombok.Data;


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
     * 优惠券类型 1、三折；2、满减
     *
     */
    private Integer couponType;
}

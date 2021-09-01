package tech.zhangzy.behavior.chain.handler;


import tech.zhangzy.behavior.chain.DiscountContext;

/**
 * 抽象处理类
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/8/31
 */
public interface DiscountHandler {

    Boolean execute(DiscountContext context);
}

package tech.zhangzy.behavior.chain;


/**
 * 抽象处理类
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/8/31
 */
public abstract class DiscountHandler {

    protected abstract Boolean execute(DiscountContext context);
}

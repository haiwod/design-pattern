package tech.zhangzy.behavior.chain;

import org.springframework.stereotype.Component;
import tech.zhangzy.behavior.chain.DiscountContext;
import tech.zhangzy.behavior.chain.handler.DiscountHandler;

import javax.annotation.Resource;
import java.util.List;

/**
 * 折扣优惠处理器调用链
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/8/31
 */
@Component
public class DiscountHandlerChain {
    /**
     * 优惠券处理器链
     */
    @Resource
    private List<DiscountHandler> discountHandlers;

    /**
     * 链路调用，直到某个处理器执行后退出
     *
     * @param context
     */
    public void handler(DiscountContext context) {
        for (DiscountHandler handler : discountHandlers) {
            if (handler.execute(context)) {
                return;
            }
        }
    }
}

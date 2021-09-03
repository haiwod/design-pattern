package tech.zhangzy.behavior.template;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * 抽象工单回调处理类
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/3
 */
@Slf4j
public abstract class AbstractTicketCallback {
    /**
     * 回调流程模板方法
     *
     * @param param
     */
    public final void callbackHandler(CallbackParam param) {
        //校验密钥
        verifySecretKey(param);
        //工单落库
        insertTicket(param);
        //获取订单详情
        Map<String, String> orderInfo = queryOrderDetail(param);
        //调用三方接口，补充工单扩展字段
        completeTicket(orderInfo, param);
    }

    /**
     * 子类工单类型
     *
     * @return
     */
    protected abstract TicketTypeEnum getTicketTypeEnum();

    /**
     * 子类补充逻辑
     *
     * @param orderInfo
     * @param param
     */
    protected abstract void completeTicket(Map<String, String> orderInfo, CallbackParam param);

    private void verifySecretKey(CallbackParam param) {
        log.info("-------校验密钥-------");
    }

    private void insertTicket(CallbackParam param) {
        log.info("-------工单落库-------");
    }

    private Map<String, String> queryOrderDetail(CallbackParam param) {
        log.info("-------获取订单详情-------");
        return null;
    }

}

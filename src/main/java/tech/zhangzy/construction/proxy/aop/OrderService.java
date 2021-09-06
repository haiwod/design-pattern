package tech.zhangzy.construction.proxy.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 模拟订单服务
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/6
 */
@Component
@Slf4j
public class OrderService {

    @ApiMonitor(timeout = 1000, warnType = {WarnNotifyEnum.MAIL, WarnNotifyEnum.PHONE})
    public void orderTimeout() {
        log.info("--------下单开始---------");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("--------下单结束---------");
    }


    @ApiMonitor
    public void orderEx() {
        log.info("--------下单开始---------");
        throw new RuntimeException("下单错误");
    }

}

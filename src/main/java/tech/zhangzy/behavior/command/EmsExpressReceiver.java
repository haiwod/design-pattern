package tech.zhangzy.behavior.command;

import lombok.extern.slf4j.Slf4j;

/**
 * EMS快递接收者
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/10
 */
@Slf4j
public class EmsExpressReceiver extends ExpressReceiver {
    public EmsExpressReceiver(String name) {
        this.name = name;
    }

    @Override
    protected void deliver() {
        log.info("--------ems-name:{}，发货中---------", name);
    }

    @Override
    protected void sign() {
        log.info("--------ems-name:{}，签收确认---------", name);
    }
}

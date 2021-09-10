package tech.zhangzy.behavior.command;

import lombok.extern.slf4j.Slf4j;

/**
 * 顺丰快递接收者
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/10
 */
@Slf4j
public class SfExpressReceiver extends ExpressReceiver {
    public SfExpressReceiver(String name) {
        this.name = name;
    }

    @Override
    protected void deliver() {
        log.info("--------sf-name:{}，发货中---------", name);
    }

    @Override
    protected void sign() {
        log.info("--------sf-name:{}，签收确认---------", name);
    }
}

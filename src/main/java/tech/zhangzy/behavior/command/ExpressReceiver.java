package tech.zhangzy.behavior.command;

import lombok.Data;

/**
 * 命令接收方，快递处理
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/10
 */
@Data
public abstract class ExpressReceiver {

    protected String name;

    /**
     * 发货
     */
    protected abstract void deliver();

    /**
     * 签收
     */
    protected abstract void sign();
}

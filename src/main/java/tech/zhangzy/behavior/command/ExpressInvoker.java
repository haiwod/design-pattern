package tech.zhangzy.behavior.command;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 物流调用（命令发起方）
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/10
 */
@Slf4j
@Data
public class ExpressInvoker {

    private Command deliverCommand;

    private Command signCommand;

    public void deliver() {
        deliverCommand.execute();
    }

    public void sign() {
        signCommand.execute();
    }
}

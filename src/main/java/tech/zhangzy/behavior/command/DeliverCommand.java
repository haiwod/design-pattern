package tech.zhangzy.behavior.command;

/**
 * 发货命令
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/10
 */
public class DeliverCommand implements Command {
    private ExpressReceiver receiver;

    public DeliverCommand(ExpressReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.deliver();
    }
}

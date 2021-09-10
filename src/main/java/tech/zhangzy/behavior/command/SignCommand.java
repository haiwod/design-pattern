package tech.zhangzy.behavior.command;

/**
 * 签收命令
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/10
 */
public class SignCommand implements Command {
    private ExpressReceiver receiver;

    public SignCommand(ExpressReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.sign();
    }
}

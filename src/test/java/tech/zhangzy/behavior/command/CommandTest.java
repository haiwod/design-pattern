package tech.zhangzy.behavior.command;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * 命令模式测试
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/10
 */
@Slf4j
class CommandTest {

    @Test
    void test() {
        Command sfDeliver=new DeliverCommand(new SfExpressReceiver("sf工作人员"));
        Command sfSign=new SignCommand(new SfExpressReceiver("sf工作人员"));
        Command emsDeliver=new DeliverCommand(new EmsExpressReceiver("ems工作人员"));
        Command emsSign=new SignCommand(new EmsExpressReceiver("ems工作人员"));
        //调用顺丰发货，签收命令
        ExpressInvoker sfInvoker=new ExpressInvoker();
        sfInvoker.setDeliverCommand(sfDeliver);
        sfInvoker.setSignCommand(sfSign);
        sfInvoker.deliver();
        sfInvoker.sign();
        //调用ems发货，签收命令
        ExpressInvoker emsInvoker=new ExpressInvoker();
        emsInvoker.setDeliverCommand(emsDeliver);
        emsInvoker.setSignCommand(emsSign);
        emsInvoker.deliver();
        emsInvoker.sign();
    }
}
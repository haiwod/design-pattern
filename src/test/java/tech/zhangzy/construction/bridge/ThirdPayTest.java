package tech.zhangzy.construction.bridge;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * 桥梁模式测试
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/6
 */
@Slf4j
class ThirdPayTest {

    @Test
    void clientTest() {
        //支付宝-人脸支付
        AbstractThirdPay aliPay = new AliPay(new FacialPayVerify());
        aliPay.transfer("20210907001","100.50");

        //微信-指纹支付
        AbstractThirdPay wxPay = new WeChatPay(new FingerprintPayVerify());
        wxPay.transfer("20210907002","1200.50");
    }
}
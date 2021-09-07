package tech.zhangzy.construction.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * 支付指纹校验
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/7
 */
@Slf4j
public class FingerprintPayVerify implements IPayVerify {

    @Override
    public boolean verify() {
        log.info("---------指纹支付校验通过---------");
        return true;
    }
}

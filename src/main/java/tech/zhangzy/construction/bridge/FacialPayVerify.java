package tech.zhangzy.construction.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * 支付人脸识别校验
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/7
 */
@Slf4j
public class FacialPayVerify implements IPayVerify{

    @Override
    public boolean verify() {
        log.info("---------人脸支付校验通过---------");
        return true;
    }
}

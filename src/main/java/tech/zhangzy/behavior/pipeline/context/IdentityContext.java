package tech.zhangzy.behavior.pipeline.context;

import lombok.*;

import java.math.BigDecimal;

/**
 * 身份校验信息
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/1
 */
@Getter
@Setter
@ToString(callSuper = true)
public class IdentityContext extends VerifyContext {
    /**
     * 身份证
     */
    private String identityCode;
    /**
     * 姓名
     */
    private String name;
    /**
     * 手机
     */
    private String phone;
    /**
     * 金额
     */
    private BigDecimal amount;
    /**
     * 支付渠道
     */
    private String channel;
}

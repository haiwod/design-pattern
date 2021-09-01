package tech.zhangzy.behavior.pipeline.executor;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 风控类型枚举
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/1
 */
@AllArgsConstructor
@Getter
public enum VerifyTypeEnum {
    /**
     * 身份校验
     */
    IDENTITY(1, "身份校验"),
    /**
     * 支付校验
     */
    PAY(2, "支付校验");

    private Integer val;

    private String desc;
}

package tech.zhangzy.behavior.pipeline;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 风控事件枚举（事件->风控执行器链）
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/09/02
 */
@AllArgsConstructor
@Getter
public enum VerifyEventEnum {
    /**
     * 下单
     */
    ORDER(1, "下单事件"),
    /**
     * 注册事件
     */
    REGISTER(2, "注册事件"),
    /**
     * 登录事件
     */
    LOGIN(3, "登录事件");

    private Integer val;

    private String desc;
}

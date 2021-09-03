package tech.zhangzy.behavior.strategy;

import lombok.Data;

import java.io.Serializable;

/**
 * 登录校验信息
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/3
 */
@Data
public class LoginVerifyParam implements Serializable {
    private Integer loginType;

    private String userName;

    private String phone;
}

package tech.zhangzy.behavior.state;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 订单状态流转结果
 *
 * @author zhangzy
 * @date 2022/05/14
 * @since 1.8
 */
@AllArgsConstructor
@Data
public class OrderResult {

    private String code;

    private String message;

}

package tech.zhangzy.behavior.template;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 工单类型枚举
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/3
 */
@AllArgsConstructor
@Getter
public enum TicketTypeEnum {
    /**
     * 自营平台
     */
    SELF_PLATFORM(1, "自营平台"),
    /**
     * 美团
     */
    MEITUAN(2, "美团"),
    /**
     * 饿了么
     */
    ELEME(3,"饿了么");

    private Integer val;

    private String desc;
}

package tech.zhangzy.construction.adapter.obj;

import lombok.Data;

import java.io.Serializable;

/**
 * 评价入参
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/8
 */
@Data
public class QueryCommentListParam implements Serializable {
    private static final long serialVersionUID = -3644457939371498027L;
    /**
     * 平台，0，自营，1、美团，2、饿了么，3、大众点评
     */
    private Integer platform;
    /**
     * 自营的门店编码
     */
    private Long shopCode;
    /**
     * 页数
     */
    private Integer pageNum;
    /**
     * 条数
     */
    private Integer pageSize;
}

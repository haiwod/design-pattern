package tech.zhangzy.construction.adapter.obj;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 评价出参
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/8
 */
@Data
public class QueryCommentListDTO implements Serializable {

    private static final long serialVersionUID = 6947169283861584178L;
    /**
     * 评价ID
     */
    private String commentId;
    /**
     * 评论内容
     */
    private String content;
    /**
     * 评价时间
     */
    private Date commentTime;
    /**
     * 平台，0，自营，1、美团，2、饿了么，3、大众点评
     */
    private Integer platform;
    /**
     * 自营的门店编码
     */
    private Long shopCode;
}

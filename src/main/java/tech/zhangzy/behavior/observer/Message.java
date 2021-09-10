package tech.zhangzy.behavior.observer;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 消息报文
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/10
 */
@Data
@ToString
public class Message implements Serializable {
    private static final long serialVersionUID = -836937178350136101L;

    private String msgId;

    private String content;

    private Date time;
}

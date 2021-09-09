package tech.zhangzy.construction.facade;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * 消息基类
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/9
 */
@Getter
@Setter
@ToString
public class MessageParam implements Serializable {
    private static final long serialVersionUID = -7599040964517625932L;

    private String msgId;

    private List<Integer> pushService;

    private String msgContent;

    private Integer msgType;
}

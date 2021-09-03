package tech.zhangzy.behavior.template;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 回调信息
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/3
 */
@Data
public class CallbackParam implements Serializable {

    private String secretKey;

    private String ticketId;

    private String ticketContent;

    private String orderNo;

    private Integer ticketType;

    private List<Map<String,String>> extendList;
}

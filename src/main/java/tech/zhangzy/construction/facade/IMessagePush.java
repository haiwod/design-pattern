package tech.zhangzy.construction.facade;

/**
 * 消息推送接口
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/9
 */
public interface IMessagePush {
    /**
     * 消息推送
     * @param msg
     * @return
     */
    boolean push(String msg);

    /**
     * 系统类型
     * @return
     */
    ServiceTypeEnum getServiceType();
}

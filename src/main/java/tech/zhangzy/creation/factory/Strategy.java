package tech.zhangzy.creation.factory;

/**
 * 抽象策略类
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/11
 */
public interface Strategy<K> {
    /**
     * 策略的key
     *
     * @return
     */
    K getKey();
}

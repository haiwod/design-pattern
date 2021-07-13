package tech.zhangzy.creation.singleton;

import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * 枚举实现单例
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/7/13
 */
@Getter
@ToString
@Slf4j
public enum SingletonEnum {
    /**
     * 单例枚举
     */
    INSTANCE;

    public void test(){
        log.info("【单例枚举】--->>>测试");
    }
}

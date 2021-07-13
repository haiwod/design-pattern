package tech.zhangzy.creation.singleton;

/**
 * 饿汉式单例
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/6/30
 */
public class HungrySingleton {
    private HungrySingleton() {
    }

    private static HungrySingleton singleton = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return singleton;
    }
}

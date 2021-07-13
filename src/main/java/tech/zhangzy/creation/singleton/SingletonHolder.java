package tech.zhangzy.creation.singleton;

/**
 * 静态嵌套类实现单例
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/7/13
 */
public class SingletonHolder {
    private static class SingletonInner {
        private static SingletonHolder instance = new SingletonHolder();
    }

    private SingletonHolder() {
    }

    public static SingletonHolder getInstance() {
        return SingletonInner.instance;
    }
}

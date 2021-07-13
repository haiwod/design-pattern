package tech.zhangzy.creation.singleton;

/**
 * 懒汉加载
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/7/13
 */
public class LazySingleton {
    private LazySingleton() {
    }

    private static volatile LazySingleton instance;

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}

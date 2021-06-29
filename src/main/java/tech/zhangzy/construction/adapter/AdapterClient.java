package tech.zhangzy.construction.adapter;


/**
 * 客户端调用ILoginSrc接口
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/6/29
 */
public class AdapterClient {
    public static void main(String[] args) {
        adapter1();
        // adapter2();
    }

    /**
     * 对象适配
     */
    private static void adapter1() {
        ILoginSrc loginSrc = new AppLoginAdapter();
        loginSrc.login("15653333566", "9993");
    }

    /**
     * 类适配
     */
    private static void adapter2() {
        ILoginSrc loginSrc = new WeChatLoginAdapter();
        loginSrc.login("15653333566", "9993");
    }
}

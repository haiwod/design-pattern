package tech.zhangzy.construction.proxy.jdk;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 用户风控检测
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/8
 */
@Slf4j
public class UserVerifyHandler implements InvocationHandler {
    private Object object;

    public UserVerifyHandler(Object object) {
        this.object = object;
    }

    public Object createProxy() {
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        log.info("---------用户风控检测开始---------");
        try {
            result = method.invoke(object, args);
            log.info("---------用户风控检测通过---------");
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
        }
        log.info("---------用户风控检测结束---------");
        return result;
    }
}

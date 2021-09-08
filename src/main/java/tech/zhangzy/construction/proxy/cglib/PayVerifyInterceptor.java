package tech.zhangzy.construction.proxy.cglib;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 支付校验功能
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/8
 */
@Slf4j
public class PayVerifyInterceptor implements MethodInterceptor {
    private Object object;

    public PayVerifyInterceptor(Object object) {
        this.object = object;
    }

    public Object createProxy() {
        Enhancer enhancer = new Enhancer();
        //设置生成代理类的父类
        enhancer.setSuperclass(object.getClass());
        //设置回调,代理类执行目标类方法都调用intercept
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object result = null;
        log.info("---------支付风控检测开始---------");
        try {
            //父类方法
            result = methodProxy.invokeSuper(obj, args);
            log.info("---------支付风控检测通过---------");
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
        }
        log.info("---------支付风控检测结束---------");
        return result;
    }
}

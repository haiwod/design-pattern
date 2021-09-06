/**
 * 代理模式（静态和动态），对方法进行增强
 * 1、AspectJ编译时织入字节码，性能高
 * 2、Spring aop中的jdk proxy和cglib都是运行时增强，性能较低
 * 场景：spring中aop的应用，可用于监控、限流、日志、事务、降级、幂等、缓存的业务场景
 */
package tech.zhangzy.construction.proxy;
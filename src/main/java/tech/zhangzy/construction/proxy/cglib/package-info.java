/**
 * 代理模式（静态和动态），对方法进行增强
 * AspectJ编译时织入字节码，性能高
 * Spring aop中的jdk proxy和cglib都是运行时增强，性能较低
 * 场景：spring中aop的应用
 */
package tech.zhangzy.construction.proxy.cglib;
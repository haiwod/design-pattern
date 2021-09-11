# 设计模式

## 创建型

### 单例模式

饿汉式：`tech.zhangzy.creation.singleton.HungrySingleton`

DCL懒加载：`tech.zhangzy.creation.singleton.LazySingleton`

枚举单例：`tech.zhangzy.creation.singleton.SingletonEnum`

静态内部类实现单例：`tech.zhangzy.creation.singleton.SingletonHolder`

### 工厂模式

1. 简单工厂

   抽象部分：产品

   Spring中两种装载方式：

   `tech.zhangzy.behavior.template.TicketCallbackHandlerFactory`

   `tech.zhangzy.behavior.status.OrderContext`

2. 工厂方法（一个工厂一个产品）

   抽象：产品、工厂

   产品抽象：`tech.zhangzy.creation.factory.Strategy`

   工厂抽象：`tech.zhangzy.creation.factory.StrategyFactory`

   工厂配置：`tech.zhangzy.creation.factory.FactoryConfig`

3. 抽象工厂（产品族概念，工厂方法横向扩展，一个工厂多个产品）

### 建造者模式

测试类：`tech.zhangzy.creation.builder.BuilderTest`

### 原型模式

浅拷贝：实现Cloneable接口，重写clone方法

深拷贝：利用序列化和反序列化实现深拷贝

测试类：`tech.zhangzy.creation.prototype.PrototypeTest`

## 结构型

### 适配器模式

接口适配

类适配

对象适配

测试类：`tech.zhangzy.construction.adapter.AdapterTest`

### 桥梁模式

测试类：`tech.zhangzy.construction.bridge.ThirdPayTest`

### 装饰器模式

测试类：`tech.zhangzy.construction.decorator.DecoratorTest`

### 外观模式

测试类：`tech.zhangzy.construction.facade.FacadeTest`

### 代理模式

AOP案例测试类：`tech.zhangzy.construction.proxy.aop.OrderServiceTest`

JDK动态代理测试类：`tech.zhangzy.construction.proxy.jdk.JDKProxyTest`

CGLIB动态代理测试类：`tech.zhangzy.construction.proxy.cglib.CglibProxyTest`

### 组合模式

暂无

### 享元模式

暂无

## 行为型

### 责任链模式

测试类：`tech.zhangzy.behavior.chain.DiscountHandlerChainTest`

### 管道模式（责任链变种）

测试类：`tech.zhangzy.behavior.pipeline.VerifyTest`

### 策略模式

测试类：`tech.zhangzy.behavior.strategy.LoginContextTest`

### 模板模式

测试类：`tech.zhangzy.behavior.template.TicketCallbackTest`

### 命令模式

角色：命令，接收者，发起者

测试类：`tech.zhangzy.behavior.command.CommandTest`

### 观察者模式

测试类：`tech.zhangzy.behavior.observer.TopicMessageTest`

### 状态模式

测试类：`tech.zhangzy.behavior.status.OrderStatusTest`

### 迭代器模式

暂无

### 备忘录模式

暂无

### 访问者模式

暂无

### 解释器模式

暂无

### 中介模式

暂无

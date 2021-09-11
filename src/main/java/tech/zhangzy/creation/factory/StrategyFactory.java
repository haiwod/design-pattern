package tech.zhangzy.creation.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 策略工厂（K是策略的标识，枚举或者id，V是具体策略的实现）
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/11
 */
public class StrategyFactory<K, V extends Strategy<K>> implements InitializingBean, ApplicationContextAware {
    private ApplicationContext applicationContext;

    private Map<K, V> strategyMap;

    private Class<V> StrategyClazz;

    public StrategyFactory(Class<V> StrategyClazz) {
        this.StrategyClazz = StrategyClazz;
    }

    /**
     * 获取策略执行bean
     *
     * @param key
     * @return
     */
    public V getStrategy(K key) {
        return strategyMap.get(key);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Collection<V> strategyList = applicationContext.getBeansOfType(StrategyClazz).values();
        strategyMap = new ConcurrentHashMap<>(strategyList.size());
        for (V strategy : strategyList) {
            strategyMap.put(strategy.getKey(), strategy);
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}

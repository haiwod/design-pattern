package tech.zhangzy.behavior.observer;

import org.springframework.scheduling.concurrent.CustomizableThreadFactory;

import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 自定义消息主题
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/10
 */
public class CustomTopic {

    /**
     * 消费者异步处理池
     */
    private static final ThreadPoolExecutor CONSUME_POOL = new ThreadPoolExecutor(4, 10, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(100)
            , new CustomizableThreadFactory("consumer-pool-"),
            new ThreadPoolExecutor.CallerRunsPolicy());

    private String topicName;

    public String getTopicName() {
        return this.topicName;
    }

    private Map<String, TopicConsumer> consumerMap = new ConcurrentHashMap<>();

    public CustomTopic(String topicName) {
        this.topicName = topicName;
    }

    public void addConsumer(TopicConsumer consumer) {
        this.consumerMap.put(consumer.getIp(), consumer);
    }

    public void removeConsumer(TopicConsumer consumer) {
        this.consumerMap.remove(consumer.getIp());
    }

    public void notifyConsumer(Message msg) {
        consumerMap.values().forEach(consumer -> {
            //异步处理
            CONSUME_POOL.execute(() -> consumer.consume(msg));
        });
    }
}

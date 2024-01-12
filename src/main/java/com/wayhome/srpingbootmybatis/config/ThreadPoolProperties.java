package com.wayhome.srpingbootmybatis.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "thread.pool")
public class ThreadPoolProperties {

    private static final int DEFAULT_CORE_SIZE = 5;
    private static final int DEFAULT_MAX_SIZE = 10;
    private static final int DEFAULT_QUEUE_CAPACITY = 50;
    private static final int DEFAULT_KEEP_ALIVE_SECONDS = 60;
    private static final String DEFAULT_NAME_PREFIX = "THREAD-";

    private int coreSize = DEFAULT_CORE_SIZE;

    private int maxSize = DEFAULT_MAX_SIZE;

    private int queueCapacity = DEFAULT_QUEUE_CAPACITY;

    private int keepAliveSeconds = DEFAULT_KEEP_ALIVE_SECONDS;

    private String namePrefix = DEFAULT_NAME_PREFIX;
}

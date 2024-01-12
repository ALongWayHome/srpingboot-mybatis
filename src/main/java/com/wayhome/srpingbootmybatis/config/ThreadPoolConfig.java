package com.wayhome.srpingbootmybatis.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

@EnableAsync
@Configuration
@ConditionalOnBean(value = ThreadPoolProperties.class)
public class ThreadPoolConfig {


    @Bean(name = "asyncServiceExecutor")
    public ThreadPoolTaskExecutor asyncServiceExecutor(ThreadPoolProperties poolProperties){
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(poolProperties.getCoreSize());
        threadPoolTaskExecutor.setMaxPoolSize(poolProperties.getMaxSize());
        threadPoolTaskExecutor.setQueueCapacity(poolProperties.getQueueCapacity());
        threadPoolTaskExecutor.setKeepAliveSeconds(poolProperties.getKeepAliveSeconds());
        threadPoolTaskExecutor.setThreadNamePrefix(poolProperties.getNamePrefix());
        // rejection-policy：当pool已经达到max size的时候，如何处理新任务
        // CALLER_RUNS：不在新线程中执行任务，而是由调用者所在的线程来执行
        threadPoolTaskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
        //加载
        threadPoolTaskExecutor.initialize();
        return threadPoolTaskExecutor;
    }

}

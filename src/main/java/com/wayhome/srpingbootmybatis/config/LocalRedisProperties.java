package com.wayhome.srpingbootmybatis.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LocalRedisProperties {

    @Value("${spring.redis.host}")
    public String host;

    @Value("${spring.redis.port}")
    public int port;

    @Value("${spring.redis.timeout}")
    public int timeout;

    @Value("${spring.redis.password}")
    public String password;

    @Value("${spring.redis.database}")
    public int database;
}

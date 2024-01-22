package com.wayhome.srpingbootmybatis.config;

import com.baomidou.mybatisplus.extension.api.R;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import javax.annotation.Resource;
import java.time.Duration;

@Configuration
public class JedisConfig {

    @Resource
    private LocalRedisProperties localRedisProperties;


    @Bean(value = "distributedJedisPoolConfig")
    public JedisPoolConfig distributedJedisPoolConfig() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMinIdle(4);
        jedisPoolConfig.setMaxIdle(16);
        jedisPoolConfig.setMaxTotal(256);
        jedisPoolConfig.setMaxWait(Duration.ofMillis(60000));
        jedisPoolConfig.setTimeBetweenEvictionRuns(Duration.ofMillis(-1));
        jedisPoolConfig.setTestOnBorrow(Boolean.TRUE);
        jedisPoolConfig.setTestOnReturn(Boolean.TRUE);
        jedisPoolConfig.setTestOnCreate(Boolean.TRUE);
        return jedisPoolConfig;
    }

    @Bean("distributedJedisPool")
    public JedisPool distributedJedisPool(@Qualifier("distributedJedisPoolConfig") JedisPoolConfig distributedJedisPoolConfig){
        System.out.println(" ===================localRedisProperties.host-------" + localRedisProperties.host);
        return new JedisPool(distributedJedisPoolConfig,
                localRedisProperties.host,
                localRedisProperties.port,
                localRedisProperties.timeout,
                localRedisProperties.password
        );
    }

    @Bean("jedisConnectionFactory")
    public RedisConnectionFactory jedisConnectionFactory(@Qualifier("distributedJedisPoolConfig")JedisPoolConfig distributedJedisPoolConfig){

        return new JedisConnectionFactory(distributedJedisPoolConfig);
    }


    @Bean("testPlatformJedis")
    public Jedis testPlatformJedis(){
        return new Jedis("188.1.1.107", 6379, 5000);
    }
}

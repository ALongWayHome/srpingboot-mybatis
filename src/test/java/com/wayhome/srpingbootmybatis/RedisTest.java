package com.wayhome.srpingbootmybatis;

import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;
    List<String> list = Lists.list("hello", "word");


    @Test
    public void setKey(){
        redisTemplate.opsForValue().set("list", list);
        List<String> list = (List<String>)redisTemplate.opsForValue().get("list");
        assert list != null;
        list.forEach(System.out::println);
    }
}

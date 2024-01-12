package com.wayhome.srpingbootmybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.Cursor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ScanOptions;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/wayHome/redis/")
public class RedisTest {

    @Autowired
    private RedisTemplate<String, String> stringRedisTemplate;

    @PostMapping(value = "queryKeysByPrefix")
    public Boolean queryKeysByPrefix(){
//        Long delete = 0L;
//
//        Set<String> pmc = stringRedisTemplate.keys("AMP:CFG*");
//        if (!CollectionUtils.isEmpty(pmc)){
//            delete = stringRedisTemplate.delete(pmc);
//        }
//
//        return delete != null && delete > 0;

        Set<String> keys = new HashSet<>();
        ScanOptions.ScanOptionsBuilder builder = ScanOptions.scanOptions();
        ScanOptions scanOptions = builder.match("AMP:CFG*").count(100).build();
        Cursor<String> cursor = stringRedisTemplate.scan(scanOptions);
        while (cursor.hasNext()) {
            keys.add(cursor.next());
        }

        for (String key : keys) {
            stringRedisTemplate.delete(key);
        }
        return Boolean.TRUE;
    }
}

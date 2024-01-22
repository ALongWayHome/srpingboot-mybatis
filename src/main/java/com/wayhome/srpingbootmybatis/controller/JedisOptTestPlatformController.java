package com.wayhome.srpingbootmybatis.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping(value = "/wayhome/redisOptTestPlatform/")
public class JedisOptTestPlatformController {

    @Resource
    private Jedis testPlatformJedis;

    @PostMapping(value = "keysAndDelCfgCache")
    public void keysAndDelCfgCache(){
        Set<String> keys = testPlatformJedis.keys("AMP:CFG*");
        System.out.println("========AMP:CFG前缀key的数量是：" + keys.size());
        AtomicLong atomicLong = new AtomicLong(0);
        keys.forEach(key -> {
            Long del = testPlatformJedis.del(key);
            atomicLong.addAndGet(del);
        });
        String key = "AMP:ORG:listAllOrg::SimpleKey []";
        Long del = testPlatformJedis.del(key);
        long delCont = atomicLong.addAndGet(del);
        System.out.println("========redis执行删除任务成功条数是： " + delCont);
    }

    @PostMapping(value = "keysAndDelOrgCache")
    public void keysAndDelOrgCache(){
//        Set<String> keys = testPlatformJedis.keys("AMP:ORG*");
//        System.out.println("========AMP:ORG前缀key的数量是：" + keys.size());
//        AtomicLong atomicLong = new AtomicLong(0);
//        keys.forEach(key -> {
//            Long del = testPlatformJedis.del(key);
//            atomicLong.addAndGet(del);
//        });
//        long delCont = atomicLong.get();
//        System.out.println("========redis执行删除任务成功条数是： " + delCont);

        String key = "AMP:ORG:listAllOrg::SimpleKey []";
        Long del = testPlatformJedis.del(key);
        String isSuccess = del != null && del > 0 ? "是" : "否";
        System.out.println("是否删除成功：" + isSuccess);
    }

}

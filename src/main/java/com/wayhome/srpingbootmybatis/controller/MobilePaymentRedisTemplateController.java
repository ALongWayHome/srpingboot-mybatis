package com.wayhome.srpingbootmybatis.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping(value = "/wayhome/mobilePayment")
public class MobilePaymentRedisTemplateController {

    @Resource
    private Jedis testMobilePaymentJedis;

    @PostMapping(value = "/keysAndDelCfgCache")
    public void keysAndDelCfgCache(){
        Set<String> pmcKeys = testMobilePaymentJedis.keys("PMC:*");
        System.out.println("========PMC前缀key的数量是：" + pmcKeys.size());
        AtomicLong atomicLong = new AtomicLong(0);
        pmcKeys.forEach(key -> {
            Long del = testMobilePaymentJedis.del(key);
            atomicLong.addAndGet(del);
        });

        Set<String> mpcKeys = testMobilePaymentJedis.keys("MPC:*");
        System.out.println("========PMC前缀key的数量是：" + mpcKeys.size());
        mpcKeys.forEach(key -> {
            Long del = testMobilePaymentJedis.del(key);
            atomicLong.addAndGet(del);
        });
    }

}

package com.wayhome.srpingbootmybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.ScanParams;
import redis.clients.jedis.ScanResult;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping(value = "/wayhome/redisOptions/")
public class RedisTemplateController {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Autowired
    private JedisPool jedisPool;

//    @PostMapping(value = "delOpts")
    public void optionRedis(@RequestParam("file") MultipartFile file) throws Exception {
        List<String> delKeyList = new ArrayList<>();
        InputStreamReader isr = new InputStreamReader(file.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(isr);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            line = line.substring(3, line.length());
            line = line.replaceAll("\"", "");
            delKeyList.add(line);
        }
        System.out.println(delKeyList);
        Jedis jedis = jedisPool.getResource();
        delKeyList.forEach(key -> {
                    String s = jedis.get(key);
                    System.out.println("------------" + s);
                }
        );
    }

//    @PostMapping(value = "scanAndDel")
    public void scanAndDel() {
        Jedis jedis = jedisPool.getResource();
//        String str = jedis.get("AMP:CFG:getOrgCfgByType::SimpleKey [H13048100255,ALI_PAY_AUTH_INFO]");
//        System.out.println(str);
        ScanParams scanParams = new ScanParams();
        scanParams.match("AMP:CFG*");
        scanParams.count(5);
        String cursor = ScanParams.SCAN_POINTER_START;
        while (true){
            //使用scan命令获取数据，使用cursor游标记录位置，下次循环使用
            ScanResult<String> scanResult = jedis.scan(cursor, scanParams);
            cursor = scanResult.getCursor();// 返回0 说明遍历完成
            List<String> list = scanResult.getResult();
            long t1 = System.currentTimeMillis();
            for(int m = 0;m < list.size();m++){
                String mapentry = list.get(m);
                System.out.println(mapentry);
                //jedis.del(key, mapentry);

            }
            long t2 = System.currentTimeMillis();
            System.out.println("获取" + list.size()
                    + "条数据，耗时: " + (t2-t1) + "毫秒,cursor:" + cursor);
            if ("0".equals(cursor)){
                break;
            }
        }
    }

    @PostMapping(value = "keysAndDelCfgCache")
    public void keysAndDelCfgCache(){
        Jedis jedis = jedisPool.getResource();
        Set<String> keys = jedis.keys("AMP:CFG*");
        System.out.println("========AMP:CFG前缀key的数量是：" + keys.size());
//        keys.forEach(System.out::println);
        AtomicLong atomicLong = new AtomicLong(0);
        keys.forEach(key -> {
            Long del = jedis.del(key);
            atomicLong.addAndGet(del);
        });
        String key = "AMP:ORG:listAllOrg::SimpleKey []";
        Long del = jedis.del(key);
        long delCont = atomicLong.addAndGet(del);
        System.out.println("========redis执行删除任务成功条数是： " + delCont);
    }

    @PostMapping(value = "keysAndDelOrgCache")
    public void keysAndDelOrgCache(){
        Jedis jedis = jedisPool.getResource();
        Set<String> keys = jedis.keys("AMP:ORG*");
        System.out.println("========AMP:ORG前缀key的数量是：" + keys.size());
//        keys.forEach(System.out::println);
        AtomicLong atomicLong = new AtomicLong(0);
        keys.forEach(key -> {
            Long del = jedis.del(key);
            atomicLong.addAndGet(del);
        });
        String key = "AMP:ORG:listAllOrg::SimpleKey []";
        Long del = jedis.del(key);
        long delCont = atomicLong.addAndGet(del);
        System.out.println("========redis执行删除任务成功条数是： " + delCont);
    }

}

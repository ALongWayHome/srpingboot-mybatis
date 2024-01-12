package com.wayhome.srpingbootmybatis.config;

import com.alibaba.fastjson.JSONObject;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class CmdRunner implements CommandLineRunner {



    @Override
    public void run(String... args) throws Exception {
        //当所有的bean初始化完成后调用
        //可用于一些数据的初始化
        ThreadPoolProperties bean = SpringUtilConfig.getBean(ThreadPoolProperties.class);
        System.out.println("线程池的配置信息：" + JSONObject.toJSONString(bean));


    }
}

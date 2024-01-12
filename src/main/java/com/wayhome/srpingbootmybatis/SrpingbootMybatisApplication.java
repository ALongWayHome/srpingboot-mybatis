package com.wayhome.srpingbootmybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SrpingbootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SrpingbootMybatisApplication.class, args);
    }

}

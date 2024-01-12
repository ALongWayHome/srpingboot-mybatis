package com.wayhome.srpingbootmybatis.circulate.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterB {

    //setter注入或者在参数上的@Autowired 注入都是不会引发循环注入的。参考spring解决循环依赖，用到三级缓存
    @Autowired
    private SetterA setterA;

//    @Autowired
//    public void setSetterA(SetterA setterA) {
//        this.setterA = setterA;
//    }
}

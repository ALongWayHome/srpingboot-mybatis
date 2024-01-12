package com.wayhome.srpingbootmybatis.circulate.constructor;

import org.springframework.stereotype.Component;

@Component
public class ComponentA {
    //构造函数注入
    private final ComponentB componentB;

    public ComponentA (ComponentB componentB) {
        this.componentB = componentB;
    }
}

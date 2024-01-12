package com.wayhome.srpingbootmybatis.circulate.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ComponentB {

    //构造函数注入, 需要在构造器上加上@Lazy的注解，或者在构造器的参数上加上都是可以的，
    //但是需要注意的是尽量不要在构造函数中作其他的事情, 尤其是不要调用@Lazy修饰的对象
    private final ComponentA componentA;

    @Lazy
    public ComponentB (/*@Lazy*/ ComponentA componentA) {
        //不管是在赋值前还是后都会引发循环依赖的问题
//        System.out.println("==========" + componentA);
        this.componentA = componentA;
//        System.out.println("==========" + componentA);
    }
}

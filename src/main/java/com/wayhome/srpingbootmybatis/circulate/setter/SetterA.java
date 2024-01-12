package com.wayhome.srpingbootmybatis.circulate.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class SetterA {

    @Autowired
    @Lazy
    private SetterB setterB;

//    @Autowired
//    public SetterB getSetterB() {
//        return setterB;
//    }
}

package com.wayhome.srpingbootmybatis.test.entity;

import lombok.Data;

@Data
public class Person {

    private Integer age;

    private String psnCode;

    private String psnName;

    private String gend;

    public Person(){

    }

    public Person(String psnCOde, String psnName) {
        this.psnCode = psnCOde;
        this.psnName = psnName;
    }
}

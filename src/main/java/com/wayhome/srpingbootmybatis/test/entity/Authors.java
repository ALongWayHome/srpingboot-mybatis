package com.wayhome.srpingbootmybatis.test.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Authors extends Person{

    private String name;

    private String tel;

}

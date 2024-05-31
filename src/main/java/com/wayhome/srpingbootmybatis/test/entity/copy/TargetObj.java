package com.wayhome.srpingbootmybatis.test.entity.copy;

import lombok.Data;

import java.util.List;

@Data
public class TargetObj {

    private String id;

    private String name;

    private List<String> active;

    private List<SOpt> list;

}

package com.wayhome.srpingbootmybatis.test.entity;

import lombok.Data;

import java.util.List;

@Data
public class Books {


    private String bookName;

    private String clazzType;

    private Authors authors;

    private List<String> list;

    private int star = 100;

    private long cnt = 10L;

}

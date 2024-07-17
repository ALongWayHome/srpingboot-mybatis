package com.wayhome.srpingbootmybatis.speacecase.dto;

import lombok.Data;

import java.util.Date;

@Data
public class DataDictDO {

    private String name;
    private String type;
    private String label;
    private String value;
    private String parentValue;
    private String system;
    private Integer sort;
    private String valiFlag;
    private String createUser;
    private Date createDate;
    private Integer version;
}

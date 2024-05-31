package com.wayhome.srpingbootmybatis.entity;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.org.apache.xpath.internal.axes.HasPositionalPredChecker;
import com.wayhome.srpingbootmybatis.annotation.CustomDateFormatter;
import com.wayhome.srpingbootmybatis.constant.CustomDatePattern;
import lombok.Data;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Data
public class User {

    private Integer id;

    private String username;

    private String classId;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private LocalDate registerDate;


    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        Map<String, User> map = new HashMap<>();
        map.put("user", user);
        System.out.println(JSONObject.toJSONString(map));
        user.setId(2);
        System.out.println(JSONObject.toJSONString(map));

    }
}

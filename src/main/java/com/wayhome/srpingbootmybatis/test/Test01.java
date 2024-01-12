package com.wayhome.srpingbootmybatis.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test01 {
    public static void main(String[] args) {
        String str = "['新建病房层流洁净病房']";

//        JSONArray objects = JSONObject.parseArray(str);
//        String collect = objects.stream().map(String::valueOf).collect(Collectors.joining(","));
//        System.out.println(collect);
        List<String> list = new ArrayList<>();
        list.add("130000");
        list.add("130300");
        System.out.println(JSON.toJSONString(list));

    }
}

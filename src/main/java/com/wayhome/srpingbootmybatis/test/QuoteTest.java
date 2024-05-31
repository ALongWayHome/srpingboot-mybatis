package com.wayhome.srpingbootmybatis.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wayhome.srpingbootmybatis.entity.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class QuoteTest {
    public static void main(String[] args) {
        User user = new User();
        setUsers(user);
        System.out.println(user);
//
//
//        List<String> list = new ArrayList<>();
//        listAdd(list);
//        list.forEach(System.out::println);

//        String str = new String("111");
//        stringEdit(str);
//        System.out.println("main-str:" + str);
//        System.out.println("main-str-hasCode : " + str.hashCode());


        Integer cnt = 0;
        Long lon = 1L;
        cntAdd(cnt);
        System.out.println("cnt::" + cnt);

        System.out.println("==============================================");

        AtomicInteger atomicInteger = new AtomicInteger(0);
        atomicAdd(atomicInteger);
        int i = atomicInteger.get();
        System.out.println("atomicInteger--get:" + i);
    }

    private static void listAdd(List<String> list) {
        list.add("记住我的名字，我叫:派大星");
    }

    private static void setUsers(User user) {
        user.setId(1);
        user.setUsername("蒋舟");
    }

    private static void cntAdd(int cnt) {
        cnt = 100;
    }
    private static void atomicAdd(AtomicInteger atomicInteger) {
        atomicInteger.set(100);
    }


    private static void stringEdit(String str) {

        System.out.println("start-method-str-hasCode:" + str.hashCode());
        str = str + "asdasdas";
        System.out.println("end-method-str-hasCode:" + str.hashCode());
    }



}

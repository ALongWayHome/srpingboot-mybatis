package com.wayhome.srpingbootmybatis.test;

import com.wayhome.srpingbootmybatis.test.entity.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListToMapTest {


    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("130100", "张三"));
        list.add(new Person("130100", "张三"));
        list.add(new Person("130200", "李四"));

        Map<String, String> map = list.stream().map(item -> {
            Person psn = new Person();
            psn.setPsnCode(item.getPsnCode());
            psn.setPsnName(item.getPsnName());
            return psn;
        }).distinct().collect(Collectors.toMap(Person::getPsnCode, Person::getPsnName));


        map.forEach((key,value)->{
            System.out.println("人员编码：" + key + " 人员名称：" + value);
        });
        List<String> collect = new ArrayList<>();
        String join = String.join(",", collect);
        System.out.println(join);
    }
}

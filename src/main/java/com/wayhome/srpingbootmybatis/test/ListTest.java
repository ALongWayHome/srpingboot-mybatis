package com.wayhome.srpingbootmybatis.test;

import com.google.common.collect.Lists;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("张三");
        strings.add("李四");
        strings.add("王五");
        strings.add("赵六");

        strings.removeIf("李四"::equals);
        System.out.println(strings);
        List<String> asList = Arrays.asList("张三", "李四", "王五", "型七");
        strings.removeAll(asList);

        System.out.println("是否为空：" + CollectionUtils.isEmpty(strings));

        System.out.println(strings);
    }
}

package com.wayhome.srpingbootmybatis.test;

import java.util.ArrayList;
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
    }
}

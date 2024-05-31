package com.wayhome.srpingbootmybatis.test;

import com.google.common.collect.Lists;
import com.wayhome.srpingbootmybatis.test.entity.Authors;
import com.wayhome.srpingbootmybatis.test.entity.Books;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class ReflexTest {


    public static void main(String[] args) throws Exception {


        reflex_extend();
    }


    public static void reflex_extend() throws Exception {
        Authors authors = new Authors();
        authors.setAge(11);
        authors.setTel("15373301429");
        authors.setGend("男");
        authors.setName("张巡");

        Class<? extends Authors> clazz = authors.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field.getName());
        }
        System.out.println("====================");
        Field[] fields1 = clazz.getFields();
        for (Field field : fields1) {
            System.out.println(field.getName());
        }


    }


    public static void reflex_1() throws Exception {
        Books books = new Books();
        books.setBookName("射雕英雄传");
        books.setList(Arrays.asList("aaaa", "bbbbb"));
        Class<Books> booksClass = Books.class;
        Field[] declaredFields = booksClass.getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            Class<?> type = field.getType();
            String typeName = type.getTypeName();
//            if (type == String.class) {
//                System.out.println("String 类型--》" + field.getName());
//            }
            System.out.println("fieldName:" + field.getName() + "  type======" + typeName + "  是否是基本数据类型" + type.isPrimitive() +
                    "  String类型：" + (type == String.class));
            Type genericType = field.getGenericType();
//            System.out.println("genericType======" + genericType);
            Object o = field.get(books);
//            System.out.println("fieldName:" + field.getName() + " instanceof: " +  (o instanceof String));

            if (o instanceof java.util.List) {
                List<?> list = (List)o;
                list.forEach(System.out::println);
            }
        }

    }
}

package com.wayhome.srpingbootmybatis.utils;


import com.google.common.collect.Lists;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CSVWriteUtils {

    /**
     * 分割符
     */
    private static final String splitString = "[split]";
    private static final String changeRowString = "\n";
    private static final String spaceString = "";

    /**
     * 导出设置好的内容
     *
     * @param content 需要导出的内容
     * @param path    导出的路径
     * @throws IOException
     */
    public static void write(String content, String path) throws IOException {
        Files.write(Paths.get(path), content.getBytes());
    }

    public static <T> String getContent(Class<T> clazz, List<T> list, List<String> fieldsList) throws IllegalAccessException {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        String title = getTitle(clazz, fieldsList, atomicInteger);
        String row = setRow(clazz, list, fieldsList, atomicInteger.get());
        String content = title + row;
        return setSepString(content);
    }


    /**
     * 字符转义
     *
     * @param content 要转义的内容
     * @return content
     */
    public static String setSepString(String content) {
        content = content.replace("\"", "\"\"");
        content = content.replace(",", "，");
        content = content.replace(splitString, ",");
        return content;
    }

    /**
     * 获取需要导出的信息
     * 注意：表头的导出是根据实体类上的@ApiModelProperty中的name属性来设置的
     * 如果没有设置name属性，那么就不会放入到导出的列表中
     *
     * @param clazz      需要导出的实体class
     * @param fieldsList 需要导出的字段集合，前台传过来
     * @return
     * @throws IllegalAccessException
     */
    public static <T> String getTitle(Class<T> clazz, List<String> fieldsList, AtomicInteger atomicInteger) throws IllegalAccessException {

        List<Field> allFields = Lists.newArrayList(clazz.getDeclaredFields());
        StringBuilder titleBuffer = new StringBuilder();

        //记录列数
        for (Field field : allFields) {
            field.setAccessible(true);
            String name = field.getName();
            if (!fieldsList.isEmpty() && !fieldsList.contains(name)) {
                continue;
            }
            if (field.isAnnotationPresent(ApiModelProperty.class)) {
                String value = field.getAnnotation(ApiModelProperty.class).name();
                titleBuffer.append(StringUtils.isEmpty(value) ? spaceString : value).append(splitString);
                atomicInteger.getAndIncrement();
            }
        }
        String title = titleBuffer.toString();
        if (StringUtils.isEmpty(title)) {
            return "";
        }

        String finalTitle = title.substring(0, title.length() - splitString.length()) + changeRowString;
        return setSepString(finalTitle);
    }

    /**
     * 设置行内容
     *
     * @param clazz      类型
     * @param list       要导出的内容合集
     * @param fieldsList 前台指定导出的字段集合
     * @param titleNum   列数
     * @return
     * @throws IllegalAccessException
     */
    public static <T> String setRow(Class<T> clazz, List<T> list, List<String> fieldsList, int titleNum) throws IllegalAccessException {

        System.out.println(Thread.currentThread().getName() + "----->进入到设置行内容--->" + LocalDateTime.now());
        List<Field> allFields = Lists.newArrayList(clazz.getDeclaredFields());
        StringBuilder rowBuffer = new StringBuilder();
        for (T t : list) {
            int i = 0;
            for (Field field : allFields) {
                field.setAccessible(true);
                String name = field.getName();
                if (!field.isAnnotationPresent(ApiModelProperty.class)) {
                    continue;
                }
                if (!fieldsList.isEmpty() && !fieldsList.contains(name)) {
                    continue;
                }
                i++;
                Object fieldValue = field.get(t);
                rowBuffer.append(fieldValue == null ? spaceString : fieldValue.toString());
                if (i == titleNum) {
                    //如果不要空行
                    if (StringUtils.isEmpty(rowBuffer.toString())) {
                        break;
                    }
                    rowBuffer.append(changeRowString);
                    break;
                } else {
                    rowBuffer.append(splitString);
                }
            }
        }
        System.out.println(Thread.currentThread().getName() +"------->设置内容完毕--->" + LocalDateTime.now());
        return setSepString(rowBuffer.toString());
    }
}

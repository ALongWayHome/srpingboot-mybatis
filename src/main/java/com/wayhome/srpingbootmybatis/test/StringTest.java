package com.wayhome.srpingbootmybatis.test;

import org.springframework.util.StringUtils;

public class StringTest {

    public static void main(String[] args) {
        String filename = "医疗机构特病单议专家申请呢表.xlsx";

        String fileType = filename.substring(filename.lastIndexOf("."));
        System.out.println(fileType);
        if (!".xls".equals(fileType) && !".xlsx".equals(fileType)) {
            System.out.println("文件不是excel格式");
        }
    }
}

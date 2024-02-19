package com.wayhome.srpingbootmybatis.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;
import lombok.Data;

import java.util.List;

@Data
public class SysUserExcel {

    @Excel(name = "序号", orderNum = "0", format = "isAddIndex")
    private Integer index = 1;

    @Excel(name = "用户账号")
    private String username;

    @Excel(name = "真实姓名")
    private String realName;

    @Excel(name = "用户性别", replace = {"男_1", "女_2"})
    private Integer gender;

    @Excel(name = "电子邮箱", width = 25)
    private String email;

    @Excel(name = "手机号码")
    private String mobile;
    // 注解映射商品信息集合
    @ExcelCollection(name = "商品信息")
    private List<GoodsExcel> goodsList;
}


package com.wayhome.srpingbootmybatis.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

@Data
public class CarExcelDTO {
    @Excel(name = "商品编号", orderNum = "0", format = "isAddIndex")
    private Integer index = 1;

    @Excel(name = "车牌号", width = 25)
    private String carNo;

    @Excel(name = "司机名称")
    private String psnName;

    @Excel(name = "电话")
    private String phone;
}

package com.wayhome.srpingbootmybatis.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;


@Data
public class GoodsExcel {

    @Excel(name = "商品编号", orderNum = "0", format = "isAddIndex")
    private Integer index = 1;

    @Excel(name = "商品名称")
    private String goodsName;

    @Excel(name = "商品价格")
    private Double goodsPrice;

    @Excel(name = "收货地址")
    private String address;

}


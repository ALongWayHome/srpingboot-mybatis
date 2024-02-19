package com.wayhome.srpingbootmybatis.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class PreFeeListExcelDTO {

    @Excel(name = "序号",orderNum = "0", format = "isAddIndex")
    private Integer index = 1;

    @Excel(name = "费用发生时间", format = "yyyy-MM-dd")
    private Date feeOcurTime;

    @Excel(name = "数量")
    private BigDecimal cnt;

    @Excel(name = "单价")
    private BigDecimal pric;

    @Excel(name = "明细项目费用总额")
    private BigDecimal detItemFeeSumamt;

    @Excel(name = "目录类别")
    private String listType;

    @Excel(name = "医疗机构目录编码")
    private String medinsListCodg;

    @Excel(name = "医药机构目录名称")
    private String medinsListName;

    @Excel(name = "商品名")
    private String prodName;

    @Excel(name = "规格")
    private String spec;

    @Excel(name = "剂型名称")
    private String dosformName;

    @Excel(name = "单次剂量描述")
    private String sinDosDscr;

    @Excel(name = "使用频次描述")
    private String usedFrquDscr;

    @Excel(name = "周期天数")
    private BigDecimal prdDays;

    @Excel(name = "用药途径描述")
    private String medcWayDscr;

    @Excel(name = "备注")
    private String memo;
}

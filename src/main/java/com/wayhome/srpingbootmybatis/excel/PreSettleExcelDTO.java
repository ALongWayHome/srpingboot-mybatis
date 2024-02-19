package com.wayhome.srpingbootmybatis.excel;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelCollection;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class PreSettleExcelDTO implements Serializable {

    @Excel(name = "序号",orderNum = "0", format = "isAddIndex")
    private Integer index = 1;

    @Excel(name = "人员名称")
    private String psnName;

    @Excel(name = "身份证号")
    private String certno;

    @Excel(name = "性别", replace = {"男_1", "女_0"})
    private String gend;

    @Excel(name = "民族", needMerge = true)
    private String naty;

    @Excel(name = "生日", format = "yyyy-MM-dd")
    private Date brdy;

    @Excel(name = "年龄", needMerge = true)
    private String age;

    @Excel(name = "开始时间", format = "yyyy-MM-dd")
    private Date begndate;

    @Excel(name = "结束时间", format = "yyyy-MM-dd")
    private Date enddate;

    @Excel(name = "结算时间", format = "yyyy-MM-dd")
    private Date setlTime;

    @Excel(name = "费用总额")
    private BigDecimal medfeeSumamt;

    @Excel(name = "年份")
    private String year;

    @Excel(name = "备注")
    private String memo;

    @ExcelCollection(name = "费用明细")
    private List<PreFeeListExcelDTO> list;
}

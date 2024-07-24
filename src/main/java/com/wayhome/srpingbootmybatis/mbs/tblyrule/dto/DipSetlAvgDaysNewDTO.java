package com.wayhome.srpingbootmybatis.mbs.tblyrule.dto;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@ApiModel(value = "dip平均住院天数")
@ExcelIgnoreUnannotated
public class DipSetlAvgDaysNewDTO {

    @ApiModelProperty(value = "主键id")
    private Long id;

    @ExcelProperty(value = "统筹区编码")
    @ApiModelProperty(value = "统筹区编码")
    private String clrOptins;

    @ExcelProperty(value = "收费级别")
    @ApiModelProperty(value = "收费级别")
    private String setlLv;

    @ExcelProperty(value = "分组诊断代码")
    @ApiModelProperty(value = "分组诊断代码")
    private String grpDiagCode;

    @ExcelProperty(value = "分组诊断名称")
    @ApiModelProperty(value = "分组诊断名称")
    private String grpDiagName;

    @ExcelProperty(value = "手术分组代码(保守治疗组,按照国家系统保守组手术编码填写)")
    @ApiModelProperty(value = "手术分组代码(保守治疗组,按照国家系统保守组手术编码填写)")
    private String oprnGrpCode;

    @ExcelProperty(value = "手术分组名称")
    @ApiModelProperty(value = "手术分组名称")
    private String oprnGrpName;

    @ExcelProperty(value = "辅助目录代码")
    @ApiModelProperty(value = "辅助目录代码")
    private String asstListCode;

    @ExcelProperty(value = "辅助目录名称")
    @ApiModelProperty(value = "辅助目录名称")
    private String asstListName;

    @ExcelProperty(value = "年度")
    @ApiModelProperty(value = "年度")
    private String setlYear;

    @ExcelProperty(value = "住院总天数")
    @ApiModelProperty(value = "住院总天数")
    private BigDecimal sumDays;

    @ExcelProperty(value = "结算人次")
    @ApiModelProperty(value = "结算人次")
    private Long setlCnt;

    @ExcelProperty(value = "平均住院天数")
    @ApiModelProperty(value = "平均住院天数")
    private BigDecimal avgDays;

    @ApiModelProperty("有效标志")
    private String valiFlag;

    @JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss",timezone = "GMT+8")
    @ApiModelProperty(value = "创建时间")
    private Date crteTime;

    @JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss",timezone = "GMT+8")
    @ApiModelProperty(value = "更新时间")
    private Date updtTime;
}

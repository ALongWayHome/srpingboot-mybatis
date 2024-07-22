package com.wayhome.srpingbootmybatis.mbs.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "导入的专家模版")
public class ExpertTemplate {

    @ExcelProperty(value = "序号")
    @ApiModelProperty(value = "序号")
    private String row;

    @ExcelProperty(value = "定点机构编码")
    @ApiModelProperty(value = "定点机构编码")
    private String fixmedinsCode;

    @ExcelProperty(value = "定点机构名称")
    @ApiModelProperty(value = "定点机构名称")
    private String fixmedinsName;

    @ExcelProperty(value = "定点机构所属区划编码")
    @ApiModelProperty(value = "定点机构所属区划编码")
    private String  fixBlngAdmdvs;

    @ExcelProperty(value = "医师姓名")
    @ApiModelProperty(value = "医师姓名")
    private String drCode;

    @ExcelProperty(value = "医师编码")
    @ApiModelProperty(value = "医师编码")
    private String drName;

    @ExcelProperty(value = "专业类别")
    @ApiModelProperty(value = "专业类别")
    private String deptMajorName;

    @ExcelProperty(value = "联系电话")
    @ApiModelProperty(value = "联系电话")
    private String phone;
}

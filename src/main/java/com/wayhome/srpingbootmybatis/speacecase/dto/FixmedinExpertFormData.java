package com.wayhome.srpingbootmybatis.speacecase.dto;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
@ExcelIgnoreUnannotated
@ApiModel(value = "经办端2-医院医生审核特病单议报表数据")
public class FixmedinExpertFormData {

    @ApiModelProperty(value = "区划编码")
    private String admdvs;

    @ExcelProperty(value = "区划名称")
    @ApiModelProperty(value = "区划名称")
    private String admdvsName;

    @ExcelProperty(value = "定点机构编码")
    @ApiModelProperty(value = "定点机构编码")
    private String fixmedinsCode;

    @ExcelProperty(value = "定点机构名称")
    @ApiModelProperty(value = "定点机构名称")
    private String fixmedinsName;

    @ExcelProperty(value = "医师代码")
    @ApiModelProperty(value = "医师代码")
    private String drCode;

    @ExcelProperty(value = "医师名称")
    @ApiModelProperty(value = "医师名称")
    private String drName;

    @ApiModelProperty(value = "专业学科")
    private String deptMajor;

    @ExcelProperty(value ="所属学科")
    @ApiModelProperty(value = "学科专业名称")
    private String deptMajorName;

    @ExcelProperty(value ="分配病例总数")
    @ApiModelProperty(value = "分配病例总数")
    private Long casesCnt;

    @ExcelProperty(value ="待审核病例")
    @ApiModelProperty(value = "待审核病例数")
    private Long unauditedCasesCnt;

    @ExcelProperty(value ="通过的病例")
    @ApiModelProperty(value = "通过的病例数")
    private Long passCasesCnt;

    @ExcelProperty(value ="未通过的病例")
    @ApiModelProperty(value = "未通过的病例数")
    private Long unPassCasesCnt;

    @ExcelProperty(value ="通过率(百分比)")
    @ApiModelProperty(value = "通过率")
    private BigDecimal passRate;
}


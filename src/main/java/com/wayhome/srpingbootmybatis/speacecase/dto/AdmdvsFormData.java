package com.wayhome.srpingbootmybatis.speacecase.dto;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
@ExcelIgnoreUnannotated
@ApiModel(value = "经办端统计3-区划统计表单")
public class AdmdvsFormData {

    @ApiModelProperty(value = "区划编码")
    private String admdvs;

    @ExcelProperty(value = "区划名称")
    @ApiModelProperty(value = "区划名称")
    private String admdvsName;

    @ExcelProperty(value = "专家数量")
    @ApiModelProperty(value = "专家数量")
    private Long expertCnt;

    @ExcelProperty(value = "申报机构数量")
    @ApiModelProperty(value = "申报机构数量")
    private Long fixmedinsCnt;


    @ExcelProperty(value = "申报病例总数")
    @ApiModelProperty(value = "申报病例总数")
    private Long casesCnt;

    @ExcelProperty(value = "待审核病例数")
    @ApiModelProperty(value = "待审核病例数")
    private Long unauditedCasesCnt;

    @ExcelProperty(value = "通过病历")
    @ApiModelProperty(value = "通过病历")
    private Long passCasesCnt;

    @ExcelProperty(value = "未通过病例")
    @ApiModelProperty(value = "未通过病例")
    private Long unPassCasesCnt;

    @ExcelProperty(value = "通过率")
    @ApiModelProperty(value = "通过率")
    private BigDecimal passRate;
}

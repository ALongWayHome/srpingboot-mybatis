package com.wayhome.srpingbootmybatis.speacecase.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
@ApiModel(value = "报表的公共数据")
public class CommonFormData {

    @ApiModelProperty(value = "区划编码")
    private String admdvs;

    @ApiModelProperty(value = "区划编码名称")
    private String admdvsName;

    @ApiModelProperty(value = "申报病例总数")
    private Long casesCnt;

    @ApiModelProperty(value = "待审核病例数")
    private Long unauditedCasesCnt;

    @ApiModelProperty(value = "通过病历")
    private Long passCasesCnt;

    @ApiModelProperty(value = "未通过病例")
    private Long unPassCasesCnt;

    @ApiModelProperty(value = "通过率")
    private BigDecimal passRate;
}

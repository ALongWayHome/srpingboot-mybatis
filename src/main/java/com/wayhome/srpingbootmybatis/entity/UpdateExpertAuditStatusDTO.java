package com.wayhome.srpingbootmybatis.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel(value = "更新专家审核状态请求参数")
public class UpdateExpertAuditStatusDTO implements Serializable {

    @ApiModelProperty(value = "专家编码-主键")
    private String expertCode;

    @ApiModelProperty(value = "审核状态 0:未审核 1:审核通过 2:审核不通过")
    private String  auditStatus;

    @ApiModelProperty(value = "审核意见")
    private String  auditMsg;

    @ApiModelProperty(value = "审核步骤")
    private String auditStep;

    @ApiModelProperty(value = "下一步审核步骤")
    private String nextAuditStep;

    @ApiModelProperty(value = "专家编码集合")
    private List<String> expertCodeList;

}

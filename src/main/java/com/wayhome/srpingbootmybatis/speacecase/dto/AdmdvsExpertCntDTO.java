package com.wayhome.srpingbootmybatis.speacecase.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "区划专家数")
public class AdmdvsExpertCntDTO {

    @ApiModelProperty(value = "区划")
    private String admdvs;

    @ApiModelProperty(value = "专家数")
    private Long expertCnt;
}

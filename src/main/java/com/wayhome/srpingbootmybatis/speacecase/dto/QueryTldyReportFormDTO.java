package com.wayhome.srpingbootmybatis.speacecase.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@ApiModel(value = "特病单议报表请求参数")
@EqualsAndHashCode(callSuper = true)
public class QueryTldyReportFormDTO extends PageInfo {

    @ApiModelProperty(value = "区划编码")
    private String admdvs;

    @ApiModelProperty(value = "定点机构名称")
    private String fixmedinsCode;

    @ApiModelProperty(value = "医师编码")
    private String drCode;

    @ApiModelProperty(value = "开始时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date startTime;

    @ApiModelProperty(value = "结束日期")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endTime;
}

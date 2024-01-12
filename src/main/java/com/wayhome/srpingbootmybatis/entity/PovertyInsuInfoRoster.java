package com.wayhome.srpingbootmybatis.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@ApiModel(value = "扶贫参保人员信息")
public class PovertyInsuInfoRoster implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "救助对象ID")
    private String matId;

    @ApiModelProperty(value = "人员编号")
    private String psnNo;

    @ApiModelProperty(value = "参保人员姓名")
    private String psnName;

    @ApiModelProperty(value = "人员证件类型")
    private String psnCertType;

    @ApiModelProperty(value = "证件号码")
    private String certno;

    @ApiModelProperty(value = "性别")
    private String gend;

    @ApiModelProperty(value = "统筹区编码")
    private String areaCode;

    @ApiModelProperty(value = "统筹区名称")
    private String areaName;

    @ApiModelProperty(value = "所属行政县名称")
    private String countyName;

    @ApiModelProperty(value = "所属行政县编码")
    private String countyCode;

    @ApiModelProperty(value = "所属行政乡镇名称")
    private String townName;

    @ApiModelProperty(value = "所属行政乡镇编码")
    private String townCode;

    @ApiModelProperty(value = "所属行政村名称")
    private String villageName;

    @ApiModelProperty(value = "所属行政村编码")
    private String villageCode;

    @ApiModelProperty(value = "开始时间")
    private LocalDateTime begntime;

    @ApiModelProperty(value = "结束时间")
    private LocalDateTime endtime;

    @ApiModelProperty(value = "救助对象身份")
    private String matIdetCode;

    @ApiModelProperty(value = "救助对象数据来源")
    private String matDataSouc;

    @ApiModelProperty(value = "参保所属医保区划")
    private String insuAdmdvs;

    @ApiModelProperty(value = "有效标志")
    private String valiFlag;

    @ApiModelProperty(value = "门慢门特病认定标识")
    private Integer opspRegFlag;

    @ApiModelProperty(value = "数据创建时间")
    private LocalDateTime crteTime;

    @ApiModelProperty(value = "数据更新时间")
    private LocalDateTime updtTime;

    @ApiModelProperty(value = "救助对象身份名称")
    private String matIdetName;

}

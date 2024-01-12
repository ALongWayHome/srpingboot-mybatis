package com.wayhome.srpingbootmybatis.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel(value = "扶贫参保人员信息")
public class PovertyInsuInfoRosterDTO implements Serializable {

    private String psnNo;

    @ApiModelProperty(value = "统筹区名称", name = "市")
    private String areaName;

    @ApiModelProperty(value = "所属行政县名称", name = "县")
    private String countyName;

    @ApiModelProperty(value = "所属行政乡镇名称", name = "乡")
    private String townName;

    @ApiModelProperty(value = "所属行政村名称", name = "村")
    private String villageName;

    @ApiModelProperty(value = "参保人员姓名", name = "姓名")
    private String psnName;

    @ApiModelProperty(value = "性别", name = "性别")
    private String gend;

    @ApiModelProperty(value = "证件号码", name = "身份证号")
    private String certno;

    @ApiModelProperty(value = "门慢门特病认定标识", name = "是否认定门诊慢（特）病")
    private String opspRegFlag;

    @ApiModelProperty(value = "救助对象身份名称", name = "特殊身份")
    private String matIdetName;

    public String setExportRow() {
        String row = this.areaName + " ," +
                this.countyName + " ," +
                this.townName + " ," +
                this.villageName + " ," +
                this.psnName + " ," +
                this.gend + " ," +
                this.certno + " ," +
                this.opspRegFlag + " ," +
                this.matIdetName + " \n";
        return row;
    }
}

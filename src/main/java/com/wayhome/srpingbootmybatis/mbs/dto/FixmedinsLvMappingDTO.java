package com.wayhome.srpingbootmybatis.mbs.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class FixmedinsLvMappingDTO {

    @ExcelProperty(value = "定点机构编码")
    @ApiModelProperty(value = "定点机构编码")
    private String fixmedinsCode;

    @ExcelProperty(value = "定点机构名称")
    @ApiModelProperty(value = "定点机构名称")
    private String fixmedinsName;

    @ExcelProperty(value = "区划编码")
    @ApiModelProperty(value = "区划编码")
    private String fixBlngAdmdvs;

    @ApiModelProperty(value = "机构等级")
    @ExcelProperty(value = "机构等级")
    private String hospLv;

    @ApiModelProperty(value = "结算等级")
    @ExcelProperty(value = "结算等级")
    private String setlLv;


    @ApiModelProperty("有效标志")
    private String valiFlag;

    @JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss",timezone = "GMT+8")
    @ApiModelProperty(value = "创建时间")
    private Date crteTime;

    @JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss",timezone = "GMT+8")
    @ApiModelProperty(value = "更新时间")
    private Date updtTime;
}

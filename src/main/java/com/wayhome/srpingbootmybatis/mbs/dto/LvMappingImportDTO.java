package com.wayhome.srpingbootmybatis.mbs.dto;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ExcelIgnoreUnannotated
@ApiModel(value = "定点等级对应关系")
public class LvMappingImportDTO {

    @ExcelProperty(value = "区划编码")
    @ApiModelProperty(value = "区划编码")
    private String fixBlngAdmdvs;

    @ExcelProperty(value = "定点机构编码")
    @ApiModelProperty(value = "定点机构编码")
    private String fixmedinsCode;

    @ExcelProperty(value = "定点机构名称")
    @ApiModelProperty(value = "定点机构名称")
    private String fixmedinsName;

    @ApiModelProperty(value = "收费级别")
    @ExcelProperty(value = "收费级别")
    private String setlLv;

    @ApiModelProperty(value = "医疗机构级别")
    @ExcelProperty(value = "医疗机构级别")
    private String hospLv;

}

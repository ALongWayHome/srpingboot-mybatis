package com.wayhome.srpingbootmybatis.mbs.expertimport.dto;

import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@ApiModel(value = "查询专家列表")
@EqualsAndHashCode(callSuper = true)
public class QFmsFixmedinsExpertDTO extends PageInfo {

    @ApiModelProperty(value = "定点机构编码")
    private String fixmedinsCode;

    @ApiModelProperty(value = "专家编码，主键ID")
    private String expertCode;

    @ApiModelProperty("清算经办机构区划")
    private String fixBlngAdmdvs;

    @ApiModelProperty(value = "医师名称")
    private String drName;

    @ApiModelProperty(value = "医师编码")
    private String drCode;

    @ApiModelProperty(value = "身份证号")
    private String certNo;

    @ApiModelProperty(value = "专业学科")
    private String deptMajor;

    @ApiModelProperty(value = "是否分配审核任务 0 不分配 1 分配")
    private String assignFlag;

    @ApiModelProperty("医师执业范围代码")
    private String drPracScpCode;

    @ApiModelProperty(value = "审核状态 0:未审核 1:审核通过 2:审核不通过")
    private String  auditStatus;

    @ApiModelProperty(value = "是否有效 0失效(禁用) 1有效(启用)")
    private String valiFlag;

}

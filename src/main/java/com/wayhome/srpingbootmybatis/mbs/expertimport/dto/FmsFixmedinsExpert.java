package com.wayhome.srpingbootmybatis.mbs.expertimport.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(value = "定点机构专家信息表")
public class FmsFixmedinsExpert {

    @ApiModelProperty("专家编码：主键")
    private String expertCode;

    @ApiModelProperty("定点医疗机构编码")
    private String fixmedinsCode;

    @ApiModelProperty("清算经办机构区划")
    private String fixBlngAdmdvs;

    @ApiModelProperty("定点机构名称")
    private String fixmedinsName;

    @ApiModelProperty("医院等级")
    private String hospLv;

    @ApiModelProperty("医师代码")
    private String drCode;

    @ApiModelProperty("医师名称")
    private String drName;

    @ApiModelProperty("人员编号")
    private String psnNo;

    @ApiModelProperty("证件号码类型")
    private String psnCertType;

    @ApiModelProperty("证件号码")
    private String certNo;

    @ApiModelProperty("科室编码")
    private String deptNo;

    @ApiModelProperty("科室名称")
    private String deptName;

    @ApiModelProperty("科别")
    private String caty;

    @ApiModelProperty("科别名称")
    private String catyName;

    @ApiModelProperty(value = "专业学科")
    private String deptMajor;

    @ApiModelProperty(value = "学科专业名称")
    private String deptMajorName;

    @ApiModelProperty("医师执业类别")
    private String drPracType;

    @ApiModelProperty("医师执业范围代码")
    private String drPracScpCode;

    @ApiModelProperty("医师执业范围名称")
    private String drPracScpName;

    @ApiModelProperty("医师专业技术职务")
    private String drProTechDuty;

    @ApiModelProperty("医师专业技术职务名称")
    private String drProTechDutyName;

    @ApiModelProperty("医师执业级别")
    private String drPracLv;

    @ApiModelProperty(value = "是否分配审核任务 0 不分配 1 分配")
    private String assignFlag;

    @ApiModelProperty(value = "审核状态 0:未审核 1:审核通过 2:审核不通过")
    private String  auditStatus;

    @ApiModelProperty(value = "审核意见")
    private String  auditMsg;

    @ApiModelProperty("有效标志")
    private String valiFlag;

    @ApiModelProperty(value = "联系电话")
    private String phone;

    @ApiModelProperty("备注")
    private String memo;

    @ApiModelProperty("更新时间")
    @JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss", timezone = "GMT+8")
    private Date updtTime;

    @ApiModelProperty("创建人id")
    private String crterId;

    @ApiModelProperty("创建人名称")
    private String crterName;

    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss",timezone = "GMT+8")
    private Date crteTime;

}

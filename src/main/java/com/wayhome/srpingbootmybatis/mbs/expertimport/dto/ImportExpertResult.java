package com.wayhome.srpingbootmybatis.mbs.expertimport.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "导入返回结果")
public class ImportExpertResult {

    @ApiModelProperty(value = "是否导入成功")
    private Boolean succeeded;

    @ApiModelProperty(value = "错误提示")
    private List<String> errMsgList;

}

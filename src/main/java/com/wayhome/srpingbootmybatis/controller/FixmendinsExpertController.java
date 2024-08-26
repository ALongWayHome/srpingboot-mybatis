package com.wayhome.srpingbootmybatis.controller;

import com.wayhome.srpingbootmybatis.config.ApiResult;
import com.wayhome.srpingbootmybatis.entity.UpdateExpertAuditStatusDTO;
import com.wayhome.srpingbootmybatis.service.FixmedisExpertInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(tags = "定点专家库控制器")
@RequestMapping(value = "/web/fixmedinsExpert")
public class FixmendinsExpertController {

    @Resource
    private FixmedisExpertInfoService fixmedisExpertInfoService;

    @ApiOperation(value = "审核专家")
    @PostMapping(value = "/updateAuditStatus")
    public ApiResult<Boolean> updateAuditStatus(@RequestBody UpdateExpertAuditStatusDTO request) throws Exception {
        return fixmedisExpertInfoService.updateAuditStatus(request);
    }

}

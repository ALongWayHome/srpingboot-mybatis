package com.wayhome.srpingbootmybatis.mbs.tblyrule.controller;

import com.wayhome.srpingbootmybatis.config.ApiResult;
import com.wayhome.srpingbootmybatis.mbs.tblyrule.service.TbdyRuleService;
import com.wayhome.srpingbootmybatis.speacecase.service.TldyReportFormService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/web/tldyRule")
public class TldyRuleImportController {

    @Resource
    private TbdyRuleService tbdyRuleService;

    @PostMapping(value = "/importData")
    public ApiResult<Boolean> importData(MultipartFile file) throws Exception {
        return tbdyRuleService.importTldyRuleData(file);
    }
}

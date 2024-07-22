package com.wayhome.srpingbootmybatis.mbs.controller;

import com.wayhome.srpingbootmybatis.config.ApiResult;
import com.wayhome.srpingbootmybatis.mbs.service.FixmedinsLvMappingService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/web/fixmedinsLvMapping")
public class FixmedinsLvMappingController {


    @Resource
    private FixmedinsLvMappingService fixmedinsLvMappingService;

    @PostMapping(value = "/importData")
    public ApiResult<Boolean> importData(MultipartFile file) throws Exception {

       return fixmedinsLvMappingService.importMappingData(file);
    }
}

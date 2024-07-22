package com.wayhome.srpingbootmybatis.mbs.expertimport.controller;

import com.wayhome.srpingbootmybatis.config.ApiResult;
import com.wayhome.srpingbootmybatis.mbs.expertimport.dto.ImportExpertResult;
import com.wayhome.srpingbootmybatis.mbs.expertimport.service.FixmedinsExpertService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/web/fixmedinsExpert")
public class ExpertImportController {


    @Resource
    private FixmedinsExpertService fixmedinsExpertService;

    @PostMapping("/importExpertData")
    public ApiResult<ImportExpertResult> importExpertData(MultipartFile file) throws Exception {

        return fixmedinsExpertService.importExpertData(file);
    }



    @PostMapping("/downloadTemplate")
    public void downloadTemplate() throws Exception {
        fixmedinsExpertService.downloadExpertTemplate();
    }
}

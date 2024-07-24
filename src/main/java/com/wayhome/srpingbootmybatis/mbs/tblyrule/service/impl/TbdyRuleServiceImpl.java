package com.wayhome.srpingbootmybatis.mbs.tblyrule.service.impl;

import com.wayhome.srpingbootmybatis.config.ApiResult;
import com.wayhome.srpingbootmybatis.mbs.tblyrule.bo.TbdyRuleBO;
import com.wayhome.srpingbootmybatis.mbs.tblyrule.service.TbdyRuleService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@Service
public class TbdyRuleServiceImpl implements TbdyRuleService {

    @Resource
    private TbdyRuleBO tbdyRuleBO;

    @Override
    public ApiResult<Boolean> importTldyRuleData(MultipartFile file) throws Exception {
        return tbdyRuleBO.importTldyRuleData(file);
    }
}

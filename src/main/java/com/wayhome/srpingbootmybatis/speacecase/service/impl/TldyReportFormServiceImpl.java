package com.wayhome.srpingbootmybatis.speacecase.service.impl;

import com.github.pagehelper.PageInfo;
import com.wayhome.srpingbootmybatis.config.ApiResult;
import com.wayhome.srpingbootmybatis.speacecase.bo.TldyReportFormBO;
import com.wayhome.srpingbootmybatis.speacecase.dto.AdmdvsFormData;
import com.wayhome.srpingbootmybatis.speacecase.dto.FixmedinExpertFormData;
import com.wayhome.srpingbootmybatis.speacecase.dto.FixmedinsFormData;
import com.wayhome.srpingbootmybatis.speacecase.dto.QueryTldyReportFormDTO;
import com.wayhome.srpingbootmybatis.speacecase.service.TldyReportFormService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class TldyReportFormServiceImpl implements TldyReportFormService {

    @Resource
    private TldyReportFormBO tldyReportFormBO;

    @Override
    public ApiResult<PageInfo<FixmedinsFormData>> queryFixmedinsTldyFormData(QueryTldyReportFormDTO request) throws Exception {
        return ApiResult.success(tldyReportFormBO.queryFixmedinsTldyFormData(request));
    }

    @Override
    public ApiResult<PageInfo<FixmedinExpertFormData>> queryFixmedinsExpertTldyFormData(QueryTldyReportFormDTO request) throws Exception {
        return ApiResult.success(tldyReportFormBO.queryFixmedinsExpertTldyFormData(request));
    }



    @Override
    public ApiResult<PageInfo<AdmdvsFormData>> queryAdmdvsTldyFormData(QueryTldyReportFormDTO request) throws Exception {
        return ApiResult.success(tldyReportFormBO.queryAdmdvsTldyFormData(request));
    }

    @Override
    public void exportFixmedinsTldyFormData(QueryTldyReportFormDTO request) throws Exception {
        tldyReportFormBO.exportFixmedinsTldyFormData(request);
    }

    @Override
    public void exportFixmedinsExpertTldyFormData(QueryTldyReportFormDTO request) throws Exception {
        tldyReportFormBO.exportFixmedinsExpertTldyFormData(request);
    }

    @Override
    public void exportAdmdvsTldyFormData(QueryTldyReportFormDTO request) throws Exception {
        tldyReportFormBO.exportAdmdvsTldyFormData(request);
    }

}

package com.wayhome.srpingbootmybatis.speacecase.service;

import com.github.pagehelper.PageInfo;
import com.wayhome.srpingbootmybatis.config.ApiResult;
import com.wayhome.srpingbootmybatis.speacecase.dto.AdmdvsFormData;
import com.wayhome.srpingbootmybatis.speacecase.dto.FixmedinExpertFormData;
import com.wayhome.srpingbootmybatis.speacecase.dto.FixmedinsFormData;
import com.wayhome.srpingbootmybatis.speacecase.dto.QueryTldyReportFormDTO;

public interface TldyReportFormService {

    /**
     * 经办端统计1-以区划、定点机构的纬度来统计的
     *
     * @param request 请求参数
     * @return 返回参数
     * @throws Exception 异常信息
     */
    ApiResult<PageInfo<FixmedinsFormData>> queryFixmedinsTldyFormData(QueryTldyReportFormDTO request) throws Exception;


    /**
     * 经办端统计2-以机构专家的纬度来统计，不是整体病例的审核，只是他自己审核通过不通过
     *
     * @param request 请求参数
     * @return 返回结果
     * @throws Exception 异常信息
     */
    ApiResult<PageInfo<FixmedinExpertFormData>> queryFixmedinsExpertTldyFormData(QueryTldyReportFormDTO request) throws Exception;


    /**
     * 经办端统计3-以区划纬度来统计
     *
     * @param request 请求参数
     * @return 返回结果
     * @throws Exception 异常信息
     */
    ApiResult<PageInfo<AdmdvsFormData>> queryAdmdvsTldyFormData(QueryTldyReportFormDTO request) throws Exception;

    /**
     * 经办端统计1-导出
     *
     * @param request 请求参数
     * @throws Exception
     */
    void exportFixmedinsTldyFormData(QueryTldyReportFormDTO request) throws Exception;

    /**
     * 经办端统计2-导出
     *
     * @param request 请求参数
     * @throws Exception
     */
    void exportFixmedinsExpertTldyFormData(QueryTldyReportFormDTO request) throws Exception;

    /**
     * 经办端统计3-导出
     *
     * @param request 请求参数
     * @throws Exception
     */
    void exportAdmdvsTldyFormData(QueryTldyReportFormDTO request) throws Exception;
}

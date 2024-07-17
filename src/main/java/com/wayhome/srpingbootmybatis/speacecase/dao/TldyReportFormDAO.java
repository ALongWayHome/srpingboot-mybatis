package com.wayhome.srpingbootmybatis.speacecase.dao;

import com.wayhome.srpingbootmybatis.speacecase.dto.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TldyReportFormDAO {
    /**
     * 经办端统计1-以区划、定点机构的纬度来统计的
     *
     * @param request 请求参数
     * @return 返回参数
     * @throws Exception 异常信息
     */
    List<FixmedinsFormData> queryFixmedinsTldyFormData(QueryTldyReportFormDTO request);

    /**
     * 经办端统计2-以机构专家的纬度来统计，不是整体病例的审核，只是他自己审核通过不通过
     *
     * @param request 请求参数
     * @return 返回结果
     * @throws Exception 异常信息
     */
    List<FixmedinExpertFormData> queryFixmedinsExpertTldyFormData(QueryTldyReportFormDTO request) throws Exception;

    /**
     * 经办端统计3-以区划纬度来统计
     *
     * @param request 请求参数
     * @return 返回结果
     * @throws Exception 异常信息
     */
    List<AdmdvsFormData> queryAdmdvsTldyFormData(QueryTldyReportFormDTO request) throws Exception;

    /**
     * 查询区划下的专家数量
     *
     * @param fixBlngAdmdvs 区划
     * @return 专家数量
     */
    List<AdmdvsExpertCntDTO> queryEffectiveExpertByFixBlngAdmdvs(@Param(value = "fixBlngAdmdvs") String fixBlngAdmdvs);

}

package com.wayhome.srpingbootmybatis.service;

import com.wayhome.srpingbootmybatis.config.ApiResult;
import com.wayhome.srpingbootmybatis.entity.UpdateExpertAuditStatusDTO;

public interface FixmedisExpertInfoService {

    /**
     * 审核专家信息
     *
     * @param request 请求参数
     * @return 返回结果
     */
    ApiResult<Boolean> updateAuditStatus(UpdateExpertAuditStatusDTO request) throws Exception;
}

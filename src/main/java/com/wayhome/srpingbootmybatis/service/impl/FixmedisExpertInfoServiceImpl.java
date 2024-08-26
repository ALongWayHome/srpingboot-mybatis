package com.wayhome.srpingbootmybatis.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.wayhome.srpingbootmybatis.config.ApiResult;
import com.wayhome.srpingbootmybatis.constant.BusinessConst;
import com.wayhome.srpingbootmybatis.entity.UpdateExpertAuditStatusDTO;
import com.wayhome.srpingbootmybatis.mapper.FixmedisExpertInfoDao;
import com.wayhome.srpingbootmybatis.service.FixmedisExpertInfoService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Objects;

@Service
public class FixmedisExpertInfoServiceImpl implements FixmedisExpertInfoService {

    @Resource
    private FixmedisExpertInfoDao fixmedisExpertInfoDao;

    @Override
    public ApiResult<Boolean> updateAuditStatus(UpdateExpertAuditStatusDTO request) throws Exception {

        if (Objects.isNull(request)) {
            throw new Exception("请求参数不能为空");
        }
        if (StringUtils.isEmpty(request.getExpertCode())) {
            throw new Exception("专家编码不能为空");
        }
        if (StringUtils.isEmpty(request.getAuditStatus())) {
            throw new Exception("审核状态不能为空");
        }
        if (StringUtils.isEmpty(request.getAuditStep())) {
            throw new Exception("审核步骤不能为空");
        }

        request.setNextAuditStep(checkAndReturnNextAuditStep(request));
        System.out.println("参数：" + JSONObject.toJSONString(request));
        return ApiResult.success(fixmedisExpertInfoDao.updateAuditStatus(request));
    }

    //检查审核信息
    private String checkAndReturnNextAuditStep(UpdateExpertAuditStatusDTO request) throws Exception {
        return setNextAuditStep(request);
    }

    private String setNextAuditStep(UpdateExpertAuditStatusDTO request) {
        String auditStatus = request.getAuditStatus();
        String auditStep = request.getAuditStep();
        //审核不通过,返回当前审核步骤。
        if (BusinessConst.TLDY_AUDIT_STATUS_2.equals(auditStatus)) {
            return auditStep;
        }
        //审核通过的情况的了， 如果是第一步，返回第二步。 第二或第三步都返回第三步
        if (BusinessConst.AUDIT_STEP_1.equals(auditStep)) {
            return BusinessConst.AUDIT_STEP_2;
        } else {
            return BusinessConst.AUDIT_STEP_3;
        }
    }

}

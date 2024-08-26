package com.wayhome.srpingbootmybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wayhome.srpingbootmybatis.entity.UpdateExpertAuditStatusDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FixmedisExpertInfoDao  {


    /**
     * 审核专家信息
     *
     * @param request 请求参数
     * @return 返回结果
     */
    Boolean updateAuditStatus(UpdateExpertAuditStatusDTO request);
}

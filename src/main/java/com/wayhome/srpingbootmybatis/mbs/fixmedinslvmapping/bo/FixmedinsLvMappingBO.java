package com.wayhome.srpingbootmybatis.mbs.fixmedinslvmapping.bo;

import com.wayhome.srpingbootmybatis.config.ApiResult;
import com.wayhome.srpingbootmybatis.mbs.fixmedinslvmapping.dto.FixmedinsLvMappingDTO;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface FixmedinsLvMappingBO {

    /**
     * 批量保存定点机构与收费等级灯影关系
     *
     * @param list 对应数据
     * @return 返回导入结果
     * @throws Exception 异常信息
     */
    Boolean importMappingData(List<FixmedinsLvMappingDTO> list) throws Exception;
}

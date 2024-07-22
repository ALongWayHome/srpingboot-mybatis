package com.wayhome.srpingbootmybatis.mbs.fixmedinslvmapping.service;

import com.wayhome.srpingbootmybatis.config.ApiResult;
import com.wayhome.srpingbootmybatis.mbs.dto.ImportExpertResult;
import org.springframework.web.multipart.MultipartFile;

public interface FixmedinsLvMappingService {

    /**
     * 导入专家等级对应关系
     *
     * @param file 上传文件
     * @return 返回导入结果
     * @throws Exception 异常信息
     */
    ApiResult<Boolean> importMappingData(MultipartFile file) throws Exception;
}

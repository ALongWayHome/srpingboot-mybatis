package com.wayhome.srpingbootmybatis.mbs.service;

import com.wayhome.srpingbootmybatis.config.ApiResult;
import com.wayhome.srpingbootmybatis.mbs.dto.ImportExpertResult;
import org.springframework.web.multipart.MultipartFile;

public interface FixmedinsExpertService {

    /**
     * 导入特例单议专家
     *
     * @param file 上传文件
     * @return 返回导入结果
     * @throws Exception 异常信息
     */
    ApiResult<ImportExpertResult> importExpertData(MultipartFile file) throws Exception;

    void downloadExpertTemplate() throws Exception;
}

package com.wayhome.srpingbootmybatis.mbs.tblyrule.service;

import com.wayhome.srpingbootmybatis.config.ApiResult;
import org.springframework.web.multipart.MultipartFile;

public interface TbdyRuleService {

    /**
     * 导入专家等级对应关系
     *
     * @param file 上传文件
     * @return 返回导入结果
     * @throws Exception 异常信息
     */
    ApiResult<Boolean> importTldyRuleData(MultipartFile file) throws Exception;
}

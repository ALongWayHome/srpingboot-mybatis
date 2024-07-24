package com.wayhome.srpingbootmybatis.mbs.fixmedinslvmapping.service.impl;

import com.alibaba.excel.EasyExcel;
import com.wayhome.srpingbootmybatis.config.ApiResult;
import com.wayhome.srpingbootmybatis.mbs.fixmedinslvmapping.bo.FixmedinsLvMappingBO;
import com.wayhome.srpingbootmybatis.mbs.fixmedinslvmapping.dao.FixmedinsLvMappingDao;
import com.wayhome.srpingbootmybatis.mbs.fixmedinslvmapping.dto.FixmedinsLvMappingDTO;
import com.wayhome.srpingbootmybatis.mbs.fixmedinslvmapping.dto.LvMappingImportDTO;
import com.wayhome.srpingbootmybatis.mbs.fixmedinslvmapping.service.FixmedinsLvMappingService;
import com.wayhome.srpingbootmybatis.mbs.util.FixmedinsLvMappingImportListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

@Slf4j
@Service
public class FixmedinsLvMappingServiceImpl implements FixmedinsLvMappingService {

    @Resource
    private FixmedinsLvMappingBO fixmedinsLvMappingBO;

    @Override
    public ApiResult<Boolean> importMappingData(MultipartFile file) throws Exception {
        log.info("-------导入特病单议定点机构对应等级数据begin-------");
        FixmedinsLvMappingImportListener mappingedImport = new FixmedinsLvMappingImportListener();

        try {
            InputStream inputStream = file.getInputStream();
            EasyExcel.read(inputStream, LvMappingImportDTO.class, mappingedImport).sheet().doRead();
        }catch (Exception e) {
            log.error("特病单议导入定点机构结算等级对应关系解析excel出现异常");
            e.printStackTrace();
        }
        List<FixmedinsLvMappingDTO> list = mappingedImport.getList();
        if (CollectionUtils.isEmpty(list)) {
            return ApiResult.success(Boolean.FALSE);
        }
        //测试完这个要注释掉
//        list = Collections.singletonList(list.get(0));
        Boolean result = fixmedinsLvMappingBO.importMappingData(list);
        return ApiResult.success(result);
    }
}

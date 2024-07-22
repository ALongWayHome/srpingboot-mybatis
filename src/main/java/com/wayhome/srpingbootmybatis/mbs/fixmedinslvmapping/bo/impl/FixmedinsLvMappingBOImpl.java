package com.wayhome.srpingbootmybatis.mbs.fixmedinslvmapping.bo.impl;

import com.wayhome.srpingbootmybatis.mbs.fixmedinslvmapping.bo.FixmedinsLvMappingBO;
import com.wayhome.srpingbootmybatis.mbs.fixmedinslvmapping.dao.FixmedinsLvMappingDao;
import com.wayhome.srpingbootmybatis.mbs.fixmedinslvmapping.dto.FixmedinsLvMappingDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

@Service
public class FixmedinsLvMappingBOImpl implements FixmedinsLvMappingBO {

    @Resource
    private FixmedinsLvMappingDao fixmedinsLvMappingDao;

    @Override
    public Boolean importMappingData(List<FixmedinsLvMappingDTO> list) throws Exception {
        return fixmedinsLvMappingDao.batchInsertData(list) > 0;
    }
}

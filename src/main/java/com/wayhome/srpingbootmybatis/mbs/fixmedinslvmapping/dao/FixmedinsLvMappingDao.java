package com.wayhome.srpingbootmybatis.mbs.fixmedinslvmapping.dao;

import com.wayhome.srpingbootmybatis.mbs.fixmedinslvmapping.dto.FixmedinsLvMappingDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FixmedinsLvMappingDao {

    /**
     * 批量导入定点机构映射关系
     *
     * @param list 请求参数
     * @return 是否新增成功
     */
    int batchInsertData(List<FixmedinsLvMappingDTO> list);

}

package com.wayhome.srpingbootmybatis.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wayhome.srpingbootmybatis.entity.TestIn;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestInMapper extends BaseMapper<TestIn> {

    List<String> getNameListByXml(List<Long> ids);
}

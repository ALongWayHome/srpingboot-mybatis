package com.wayhome.srpingbootmybatis.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wayhome.srpingbootmybatis.entity.TestIn;
import com.wayhome.srpingbootmybatis.mapper.TestInMapper;
import com.wayhome.srpingbootmybatis.service.TestInService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class TestInServiceImpl extends ServiceImpl<TestInMapper, TestIn> implements TestInService {

    @Override
    public List<String> getNameListByIds(List<Long> ids) {
        TestInMapper baseMapper = getBaseMapper();
        List<TestIn> testInList = baseMapper.selectBatchIds(ids);
        List<String> collect = testInList.stream().map(TestIn::getName).collect(Collectors.toList());
        if (CollectionUtils.isEmpty(collect)){
            return Collections.EMPTY_LIST;
        }
        return collect;
    }

    @Override
    public List<String> getNameListByXml(List<Long> ids) {
        return getBaseMapper().getNameListByXml(ids);
    }
}

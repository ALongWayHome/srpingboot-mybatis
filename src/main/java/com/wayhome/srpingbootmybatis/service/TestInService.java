package com.wayhome.srpingbootmybatis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wayhome.srpingbootmybatis.entity.TestIn;

import java.util.List;

public interface TestInService extends IService<TestIn> {

    List<String> getNameListByIds(List<Long> ids);

    List<String> getNameListByXml(List<Long> ids);
}

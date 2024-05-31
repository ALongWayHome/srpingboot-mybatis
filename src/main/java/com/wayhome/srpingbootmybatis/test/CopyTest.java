package com.wayhome.srpingbootmybatis.test;

import com.google.common.collect.Lists;
import com.wayhome.srpingbootmybatis.test.entity.copy.SOpt;
import com.wayhome.srpingbootmybatis.test.entity.copy.SourceObj;
import com.wayhome.srpingbootmybatis.test.entity.copy.TargetObj;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class CopyTest {

    public static void main(String[] args) {
        SourceObj sourceObj = new SourceObj();
        sourceObj.setId("202404241003");
        sourceObj.setName("i have a dram");
        sourceObj.setActive(Arrays.asList("singing", "swagging"));

        List<SOpt> list = new ArrayList<>();
        SOpt sOpt = new SOpt();
        sOpt.setSetlId("7890123");
        sOpt.setCrteTime(new Date());
        sOpt.setValiFlag("1");
        list.add(sOpt);
        sourceObj.setList(list);

        TargetObj targetObj = new TargetObj();

        BeanUtils.copyProperties(sourceObj, targetObj);

        System.out.println(targetObj);

    }

}

package com.wayhome.srpingbootmybatis.mbs.bo.impl;

import com.sun.javafx.binding.StringFormatter;
import com.wayhome.srpingbootmybatis.mbs.bo.ImportExpertBO;
import com.wayhome.srpingbootmybatis.mbs.dao.FmsFixmedinsExpertDao;
import com.wayhome.srpingbootmybatis.mbs.dto.ExpertTemplate;
import com.wayhome.srpingbootmybatis.mbs.dto.FmsFixmedinsExpert;
import com.wayhome.srpingbootmybatis.mbs.dto.QFmsFixmedinsExpertDTO;
import com.wayhome.srpingbootmybatis.mbs.util.DeptMajorEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Slf4j
@Service
public class ImportExpertBOImpl implements ImportExpertBO {

    private static ThreadPoolExecutor threadPoolExecutor;

    @PostConstruct
    public void init() {
        createThreadPool();
    }

    public static void createThreadPool() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(10000), new ThreadPoolExecutor.CallerRunsPolicy());
    }

    @Resource
    private FmsFixmedinsExpertDao fmsFixmedinsExpertDao;


    @Override
    public void importExpert(List<ExpertTemplate> list) {
        List<String> errMsgList = new ArrayList<>();
        for (ExpertTemplate expertTemplate : list) {
            threadPoolExecutor.submit(() -> processExpertTemplate(expertTemplate, errMsgList));
        }
    }

    private void processExpertTemplate(ExpertTemplate expertTemplate, List<String> errMsgList){
        //step1：校验是否已存在该专家
        QFmsFixmedinsExpertDTO qFmsFixmedinsExpertDTO = new QFmsFixmedinsExpertDTO();
        qFmsFixmedinsExpertDTO.setFixmedinsCode(expertTemplate.getFixmedinsCode());
        qFmsFixmedinsExpertDTO.setFixBlngAdmdvs(expertTemplate.getFixBlngAdmdvs());
        qFmsFixmedinsExpertDTO.setDrCode(expertTemplate.getDrCode());
        qFmsFixmedinsExpertDTO.setDeptMajor(DeptMajorEnum.getCodeByMsg(expertTemplate.getDeptMajorName()));
        FmsFixmedinsExpert fmsFixmedinsExpert = fmsFixmedinsExpertDao.queryFixmedisExpertDetailByUk(qFmsFixmedinsExpertDTO);
        if (fmsFixmedinsExpert != null) {
            String errMsg = StringFormatter.format("%s已存在%s该专家",expertTemplate.getFixmedinsName(), expertTemplate.getDrName()).getValue();
            errMsgList.add(errMsg);
            return;
        }
        //step2：根据医师编码去医师信息里查询是不是存在该医师信息

    }

}

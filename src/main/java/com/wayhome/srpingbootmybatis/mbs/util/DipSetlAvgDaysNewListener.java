package com.wayhome.srpingbootmybatis.mbs.util;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.wayhome.srpingbootmybatis.mbs.tblyrule.dao.TbdyRuleDao;
import com.wayhome.srpingbootmybatis.mbs.tblyrule.dto.DipSetlAvgDaysNewDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public class DipSetlAvgDaysNewListener extends AnalysisEventListener<DipSetlAvgDaysNewDTO>  {

    private AtomicInteger successCnt = new AtomicInteger(0);

    private List<DipSetlAvgDaysNewDTO> list = new ArrayList<>(Constants.MAX_LIST_SIZE);

    public List<DipSetlAvgDaysNewDTO> getList() {
        return list;
    }

    private final TbdyRuleDao tbdyRuleDao;

    public DipSetlAvgDaysNewListener(TbdyRuleDao tbdyRuleDao) {
        this.tbdyRuleDao = tbdyRuleDao;
    }

    @Override
    public void invoke(DipSetlAvgDaysNewDTO dipSetlAvgDaysNewDTO, AnalysisContext analysisContext) {
        if (dipSetlAvgDaysNewDTO == null) {
            return;
        }
        Date now = new Date();
        dipSetlAvgDaysNewDTO.setValiFlag("1");
        dipSetlAvgDaysNewDTO.setCrteTime(now);
        dipSetlAvgDaysNewDTO.setUpdtTime(now);

        BigDecimal avgAmt = dipSetlAvgDaysNewDTO.getAvgDays();
        if (avgAmt == null) {
            dipSetlAvgDaysNewDTO.setAvgDays(BigDecimal.ZERO);
        } else {
            dipSetlAvgDaysNewDTO.setAvgDays(avgAmt.setScale(2, RoundingMode.HALF_UP));
        }

        BigDecimal sumDays = dipSetlAvgDaysNewDTO.getSumDays();
        if (sumDays == null) {
            dipSetlAvgDaysNewDTO.setSumDays(BigDecimal.ZERO);
        } else {
            dipSetlAvgDaysNewDTO.setSumDays(sumDays.setScale(2, RoundingMode.HALF_UP));
        }

        list.add(dipSetlAvgDaysNewDTO);
        if (list.size() >= Constants.MAX_LIST_SIZE) {
            int i = tbdyRuleDao.batchInsertDipSetlAvgDaysNew(list);
            System.out.println("导入DIP平均住院天数（每解析五百条会触发一下），成功条数：" + successCnt.addAndGet(i));
            list.clear();
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        log.info("DIP平均住院天数导入调用完成");
        if (!CollectionUtils.isEmpty(list)) {
            int i = tbdyRuleDao.batchInsertDipSetlAvgDaysNew(list);
            log.info("DIP平均住院天数最后一次入库，条数为:{}, 最终导入成功条数:{}", list.size(),successCnt.addAndGet(i));
            list.clear();
        }
    }
}

package com.wayhome.srpingbootmybatis.mbs.util;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.wayhome.srpingbootmybatis.mbs.tblyrule.dao.TbdyRuleDao;
import com.wayhome.srpingbootmybatis.mbs.tblyrule.dto.DrgSetlAvgCostNewDTO;
import com.wayhome.srpingbootmybatis.mbs.tblyrule.dto.DrgSetlAvgDaysNewDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public class DrgSetlAvgDaysNewListener extends AnalysisEventListener<DrgSetlAvgDaysNewDTO> {

    private AtomicInteger successCnt = new AtomicInteger(0);
    private List<DrgSetlAvgDaysNewDTO> list = new ArrayList<>(Constants.MAX_LIST_SIZE);

    public List<DrgSetlAvgDaysNewDTO> getList() {
        return list;
    }

    private final TbdyRuleDao tbdyRuleDao;

    public DrgSetlAvgDaysNewListener(TbdyRuleDao tbdyRuleDao) {
        this.tbdyRuleDao = tbdyRuleDao;
    }

    @Override
    public void invoke(DrgSetlAvgDaysNewDTO drgSetlAvgDaysNewDTO, AnalysisContext analysisContext) {
        if (drgSetlAvgDaysNewDTO == null) {
            return;
        }
        Date now = new Date();
        drgSetlAvgDaysNewDTO.setValiFlag("1");
        drgSetlAvgDaysNewDTO.setCrteTime(now);
        drgSetlAvgDaysNewDTO.setUpdtTime(now);

        BigDecimal sumDays = drgSetlAvgDaysNewDTO.getSumDays();
        if (sumDays == null) {
            drgSetlAvgDaysNewDTO.setSumDays(BigDecimal.ZERO);
        } else {
            drgSetlAvgDaysNewDTO.setSumDays(sumDays.setScale(2, RoundingMode.HALF_UP));
        }
        BigDecimal avgDays = drgSetlAvgDaysNewDTO.getAvgDays();
        if (avgDays == null) {
            drgSetlAvgDaysNewDTO.setAvgDays(BigDecimal.ZERO);
        } else {
            drgSetlAvgDaysNewDTO.setAvgDays(avgDays.setScale(2, RoundingMode.HALF_UP));
        }

        list.add(drgSetlAvgDaysNewDTO);
        if (list.size() >= Constants.MAX_LIST_SIZE) {
            int i = tbdyRuleDao.batchInsertDrgSetlAvgDaysNew(list);
            System.out.println("导入DIP次均费用（没解析百条会触发一下），成功条数：" + successCnt.addAndGet(i));
            list.clear();
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        log.info("Drg平均住院天数导入调用完成");
        if (!CollectionUtils.isEmpty(list)) {
            int i = tbdyRuleDao.batchInsertDrgSetlAvgDaysNew(list);
            log.info("Drg平均住院天数最后一次入库，条数为:{}, 最终导入成功条数:{}", list.size(), successCnt.addAndGet(i));
            list.clear();
        }

    }
}

package com.wayhome.srpingbootmybatis.mbs.util;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.wayhome.srpingbootmybatis.mbs.tblyrule.dao.TbdyRuleDao;
import com.wayhome.srpingbootmybatis.mbs.tblyrule.dto.DrgSetlAvgCostNewDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
public class DrgSetlAvgCostNewListener extends AnalysisEventListener<DrgSetlAvgCostNewDTO> {

    private AtomicInteger successCnt = new AtomicInteger(0);
    private List<DrgSetlAvgCostNewDTO> list = new ArrayList<>(Constants.MAX_LIST_SIZE);

    public List<DrgSetlAvgCostNewDTO> getList() {
        return list;
    }

    private final TbdyRuleDao tbdyRuleDao;

    public DrgSetlAvgCostNewListener(TbdyRuleDao tbdyRuleDao) {
        this.tbdyRuleDao = tbdyRuleDao;
    }

    @Override
    public void invoke(DrgSetlAvgCostNewDTO drgSetlAvgCostNewDTO, AnalysisContext analysisContext) {
        if (drgSetlAvgCostNewDTO == null) {
            return;
        }
        Date now = new Date();
        drgSetlAvgCostNewDTO.setValiFlag("1");
        drgSetlAvgCostNewDTO.setCrteTime(now);
        drgSetlAvgCostNewDTO.setUpdtTime(now);

        BigDecimal avgAmt = drgSetlAvgCostNewDTO.getAvgAmt();
        if (avgAmt == null) {
            drgSetlAvgCostNewDTO.setAvgAmt(BigDecimal.ZERO);
        } else {
            drgSetlAvgCostNewDTO.setAvgAmt(avgAmt.setScale(2, RoundingMode.HALF_UP));
        }
        BigDecimal medfeeSumamt = drgSetlAvgCostNewDTO.getMedfeeSumamt();
        if (medfeeSumamt == null) {
            drgSetlAvgCostNewDTO.setMedfeeSumamt(BigDecimal.ZERO);
        } else {
            drgSetlAvgCostNewDTO.setMedfeeSumamt(medfeeSumamt.setScale(2, RoundingMode.HALF_UP));
        }

        list.add(drgSetlAvgCostNewDTO);
        if (list.size() >= Constants.MAX_LIST_SIZE) {
            int i = tbdyRuleDao.batchInsertDrgSetlAvgCostNew(list);
            System.out.println("导入DRG次均费用（每解析五百条会触发一下），成功条数：" + successCnt.addAndGet(i));
            list.clear();
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        log.info("DrgP次均费用导入调用完成");
        if (!CollectionUtils.isEmpty(list)) {
            int i = tbdyRuleDao.batchInsertDrgSetlAvgCostNew(list);
            log.info("DrgP次均费用导入最后一次入库，条数为:{}, 最终导入成功条数:{}", list.size(),successCnt.addAndGet(i));
            list.clear();
        }
    }
}

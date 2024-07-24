package com.wayhome.srpingbootmybatis.mbs.util;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.wayhome.srpingbootmybatis.mbs.tblyrule.dao.TbdyRuleDao;
import com.wayhome.srpingbootmybatis.mbs.tblyrule.dto.DipSetlAvgCostNewDTO;
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
public class DipSetlAvgCostNewListener extends AnalysisEventListener<DipSetlAvgCostNewDTO> {

    private AtomicInteger successCnt = new AtomicInteger(0);

    private List<DipSetlAvgCostNewDTO> list = new ArrayList<>(Constants.MAX_LIST_SIZE);

    public List<DipSetlAvgCostNewDTO> getList() {
        return list;
    }

    private final TbdyRuleDao tbdyRuleDao;

    public DipSetlAvgCostNewListener(TbdyRuleDao tbdyRuleDao) {
        this.tbdyRuleDao = tbdyRuleDao;
    }

    @Override
    public void invoke(DipSetlAvgCostNewDTO dipSetlAvgCostNewDTO, AnalysisContext analysisContext) {
        if (dipSetlAvgCostNewDTO == null) {
            return;
        }
        Date now = new Date();
        dipSetlAvgCostNewDTO.setValiFlag("1");
        dipSetlAvgCostNewDTO.setCrteTime(now);
        dipSetlAvgCostNewDTO.setUpdtTime(now);

        BigDecimal avgAmt = dipSetlAvgCostNewDTO.getAvgAmt();
        if (avgAmt == null) {
            dipSetlAvgCostNewDTO.setAvgAmt(BigDecimal.ZERO);
        } else {
            dipSetlAvgCostNewDTO.setAvgAmt(avgAmt.setScale(2, RoundingMode.HALF_UP));
        }
        BigDecimal medfeeSumamt = dipSetlAvgCostNewDTO.getMedfeeSumamt();
        if (medfeeSumamt == null) {
            dipSetlAvgCostNewDTO.setMedfeeSumamt(BigDecimal.ZERO);
        } else {
            dipSetlAvgCostNewDTO.setMedfeeSumamt(medfeeSumamt.setScale(2, RoundingMode.HALF_UP));
        }

        list.add(dipSetlAvgCostNewDTO);
        if (list.size() >= Constants.MAX_LIST_SIZE) {
            int i = tbdyRuleDao.batchInsertDipSetlAvgCostNew(list);
            System.out.println("导入DIP次均费用（每解析五百条会触发一下），成功条数：" + successCnt.addAndGet(i));
            list.clear();
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        log.info("DIP次均费用导入调用完成");
        if (!CollectionUtils.isEmpty(list)) {
            int i = tbdyRuleDao.batchInsertDipSetlAvgCostNew(list);
            log.info("DIP最后一次入库，条数为:{}, 最终导入成功条数:{}", list.size(),successCnt.addAndGet(i));
            list.clear();
        }
    }


}

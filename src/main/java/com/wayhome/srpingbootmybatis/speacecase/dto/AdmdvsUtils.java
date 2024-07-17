package com.wayhome.srpingbootmybatis.speacecase.dto;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.oracle.tools.packager.mac.MacAppBundler;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class AdmdvsUtils {

    public static void main(String[] args) {
        List<AdmdvsFormData> list = new ArrayList<>();
        AdmdvsFormData admdvsFormData = new AdmdvsFormData();
        admdvsFormData.setAdmdvs("130100");
        admdvsFormData.setAdmdvsName("石家庄");
        admdvsFormData.setCasesCnt(5L);
        admdvsFormData.setExpertCnt(3L);
        admdvsFormData.setFixmedinsCnt(2L);
        admdvsFormData.setPassCasesCnt(3L);
        admdvsFormData.setUnPassCasesCnt(2L);
        admdvsFormData.setUnauditedCasesCnt(0L);
        list.add(admdvsFormData);

        AdmdvsFormData admdvsFormData2 = new AdmdvsFormData();
        admdvsFormData2.setAdmdvs("130100");
        admdvsFormData2.setAdmdvsName("石家庄");
        admdvsFormData2.setCasesCnt(5L);
        admdvsFormData2.setExpertCnt(4L);
        admdvsFormData2.setFixmedinsCnt(1L);
        admdvsFormData2.setPassCasesCnt(2L);
        admdvsFormData2.setUnPassCasesCnt(2L);
        admdvsFormData2.setUnauditedCasesCnt(1L);
        list.add(admdvsFormData2);

        AdmdvsFormData admdvsFormData3 = new AdmdvsFormData();
        admdvsFormData3.setAdmdvs("139900");
        admdvsFormData3.setAdmdvsName("省本级");
        admdvsFormData3.setCasesCnt(5L);
        admdvsFormData3.setExpertCnt(4L);
        admdvsFormData3.setFixmedinsCnt(1L);
        admdvsFormData3.setPassCasesCnt(2L);
        admdvsFormData3.setUnPassCasesCnt(0L);
        admdvsFormData3.setUnauditedCasesCnt(3L);
        list.add(admdvsFormData3);

        Map<String, String> collect = list.stream().map(item -> {
            AdmdvsFormData a = new AdmdvsFormData();
            a.setAdmdvs(item.getAdmdvs());
            a.setAdmdvsName(item.getAdmdvsName());
            return a;
        }).distinct().collect(Collectors.toMap(AdmdvsFormData::getAdmdvs, AdmdvsFormData::getAdmdvsName));
        System.out.println(collect);
        Map<String, List<AdmdvsFormData>> map = list.stream().collect(Collectors.groupingBy(AdmdvsFormData::getAdmdvs));
        List<AdmdvsFormData> list2 = new ArrayList<>(map.size());

        map.forEach((key,value)-> {
            AdmdvsFormData entity = value.get(0);
            Long casesCnt = value.stream().mapToLong(AdmdvsFormData::getCasesCnt).sum();
            Long passCasesCnt = value.stream().mapToLong(AdmdvsFormData::getPassCasesCnt).sum();
            Long unPassCasesCnt = value.stream().mapToLong(AdmdvsFormData::getUnPassCasesCnt).sum();
            Long unauditedCasesCnt = value.stream().mapToLong(AdmdvsFormData::getUnauditedCasesCnt).sum();
            Long fixmedinsCnt = value.stream().mapToLong(AdmdvsFormData::getFixmedinsCnt).sum();
            Long expertCnt = value.stream().mapToLong(AdmdvsFormData::getExpertCnt).sum();
            entity.setCasesCnt(casesCnt);
            entity.setPassCasesCnt(passCasesCnt);
            entity.setUnPassCasesCnt(unPassCasesCnt);
            entity.setUnauditedCasesCnt(unauditedCasesCnt);
            entity.setFixmedinsCnt(fixmedinsCnt);
            entity.setExpertCnt(expertCnt);
            entity.setPassRate(calculateRatio(casesCnt, passCasesCnt));
            list2.add(entity);
        });

        System.out.println(list2);
    }
    private static BigDecimal calculateRatio(Long casesCnt, Long passCasesCnt) {
        if (Objects.isNull(casesCnt) || casesCnt <= 0) {
            return BigDecimal.ZERO;
        }
        if (Objects.isNull(passCasesCnt) || passCasesCnt <= 0) {
            return BigDecimal.ZERO;
        }
        return BigDecimal.valueOf(passCasesCnt).multiply(new BigDecimal("100")).divide(BigDecimal.valueOf(casesCnt), 2, RoundingMode.HALF_UP);
    }
}

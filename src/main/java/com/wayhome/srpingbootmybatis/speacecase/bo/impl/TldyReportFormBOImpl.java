package com.wayhome.srpingbootmybatis.speacecase.bo.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.write.style.column.SimpleColumnWidthStyleStrategy;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wayhome.srpingbootmybatis.speacecase.HeadContentCellStyle;
import com.wayhome.srpingbootmybatis.speacecase.bo.TldyReportFormBO;
import com.wayhome.srpingbootmybatis.speacecase.dao.TldyReportFormDAO;
import com.wayhome.srpingbootmybatis.speacecase.dto.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URLEncoder;
import java.util.*;
import java.util.stream.Collectors;

@Slf4j
@Service
public class TldyReportFormBOImpl implements TldyReportFormBO {


    @Resource
    private TldyReportFormDAO tldyReportFormDAO;

    @Override
    public PageInfo<FixmedinsFormData> queryFixmedinsTldyFormData(QueryTldyReportFormDTO request) throws Exception {
        checkParam(request);
        initPage(request);

        PageHelper.startPage(request.getPageNum(),request.getPageSize());
        List<FixmedinsFormData> list = tldyReportFormDAO.queryFixmedinsTldyFormData(request);
        if (!CollectionUtils.isEmpty(list)) {
            list.forEach(item -> {
                BigDecimal passRate = calculateRatio(item.getCasesCnt(), item.getPassCasesCnt());
                item.setPassRate(passRate);
            });
        }
        PageInfo<FixmedinsFormData> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public PageInfo<FixmedinExpertFormData> queryFixmedinsExpertTldyFormData(QueryTldyReportFormDTO request) throws Exception {

        checkParam(request);
        initPage(request);
        PageHelper.startPage(request.getPageNum(),request.getPageSize());
        List<FixmedinExpertFormData> list = tldyReportFormDAO.queryFixmedinsExpertTldyFormData(request);
        if (!CollectionUtils.isEmpty(list)) {
            list.forEach(item -> {
                BigDecimal passRate = calculateRatio(item.getCasesCnt(), item.getPassCasesCnt());
                item.setPassRate(passRate);
//                DataDictDO dataDic = AdmdvsCacheUtil.getDataDic(item.getAdmdvs());
//                if (!Objects.isNull(dataDic)) {
//                    item.setAdmdvsName(dataDic.getLabel());
//                }
            });
        }

        return new PageInfo<>(list);
    }

    @Override
    public PageInfo<AdmdvsFormData> queryAdmdvsTldyFormData(QueryTldyReportFormDTO request) throws Exception {
        checkParam(request);
        initPage(request);

        Map<String, Long> map = new HashMap<>();
        List<AdmdvsExpertCntDTO> admdvsExpertCntDTOS = tldyReportFormDAO.queryEffectiveExpertByFixBlngAdmdvs(request.getAdmdvs());
        if (!CollectionUtils.isEmpty(admdvsExpertCntDTOS)) {
            map = admdvsExpertCntDTOS.stream().collect(Collectors.toMap(AdmdvsExpertCntDTO::getAdmdvs, AdmdvsExpertCntDTO::getExpertCnt));
        }

        PageHelper.startPage(request.getPageNum(),request.getPageSize());
        List<AdmdvsFormData> list = tldyReportFormDAO.queryAdmdvsTldyFormData(request);
        if (CollectionUtils.isEmpty(list)) {
            return new PageInfo<>(list);
        }
        if ("130000".equals(request.getAdmdvs())) {

        }
        for(AdmdvsFormData item : list) {
            BigDecimal passRate = calculateRatio(item.getCasesCnt(), item.getPassCasesCnt());
            item.setPassRate(passRate);
            String admdvs = item.getAdmdvs();
            Long expertCnt = map.getOrDefault(admdvs, 0L);
            item.setExpertCnt(expertCnt);
//                DataDictDO dataDic = AdmdvsCacheUtil.getDataDic(admdvs);
//                if (!Objects.isNull(dataDic)) {
//                    item.setAdmdvsName(dataDic.getLabel());
//                }
        }
        return new PageInfo<>(list);
    }

    @Override
    public void exportFixmedinsTldyFormData(QueryTldyReportFormDTO request) throws Exception {
        checkParam(request);
        initPage(request);
        List<FixmedinsFormData> list = tldyReportFormDAO.queryFixmedinsTldyFormData(request);
        //todo 这儿得改
        if (!CollectionUtils.isEmpty(list)) {
            list.forEach(item -> {
                BigDecimal passRate = calculateRatio(item.getCasesCnt(), item.getPassCasesCnt());
                item.setPassRate(passRate);
//                DataDictDO dataDic = AdmdvsCacheUtil.getDataDic(item.getAdmdvs());
//                if (!Objects.isNull(dataDic)) {
//                    item.setAdmdvsName(dataDic.getLabel());
//                }
            });
        }
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setCharacterEncoding("utf-8");// 设置字符编码
        String fileName1 = URLEncoder.encode("定点机构特例单议报表", "UTF-8").replaceAll("\\+", "%20");
        response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName1 + ".xlsx"); // 设置响应头

        EasyExcel.write(response.getOutputStream(), FixmedinsFormData.class)
                .registerWriteHandler(HeadContentCellStyle.myHorizontalCellStyleStrategy())
                .registerWriteHandler(new SimpleColumnWidthStyleStrategy(20))
                .sheet("定点机构特例单议报表")
                .doWrite(list); //用io流来写入数据
    }

    @Override
    public void exportFixmedinsExpertTldyFormData(QueryTldyReportFormDTO request) throws Exception {
        checkParam(request);
        initPage(request);

        List<FixmedinExpertFormData> list = tldyReportFormDAO.queryFixmedinsExpertTldyFormData(request);
        if (!CollectionUtils.isEmpty(list)) {
            list.forEach(item -> {
                BigDecimal passRate = calculateRatio(item.getCasesCnt(), item.getPassCasesCnt());
                item.setPassRate(passRate);
//                DataDictDO dataDic = AdmdvsCacheUtil.getDataDic(item.getAdmdvs());
//                if (!Objects.isNull(dataDic)) {
//                    item.setAdmdvsName(dataDic.getLabel());
//                }
            });
        }

        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setCharacterEncoding("utf-8");// 设置字符编码
        String fileName1 = URLEncoder.encode("医疗机构专家审核特例单议报表", "UTF-8").replaceAll("\\+", "%20");
        response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName1 + ".xlsx"); // 设置响应头

        EasyExcel.write(response.getOutputStream(), FixmedinExpertFormData.class)
                .registerWriteHandler(HeadContentCellStyle.myHorizontalCellStyleStrategy())
                .registerWriteHandler(new SimpleColumnWidthStyleStrategy(20))
                .sheet("医疗机构专家审核特例单议报表")
                .doWrite(list); //用io流来写入数据
    }

    @Override
    public void exportAdmdvsTldyFormData(QueryTldyReportFormDTO request) throws Exception {
        checkParam(request);
        initPage(request);
        Map<String, Long> map = new HashMap<>();
        List<AdmdvsExpertCntDTO> admdvsExpertCntDTOS = tldyReportFormDAO.queryEffectiveExpertByFixBlngAdmdvs(request.getAdmdvs());
        if (!CollectionUtils.isEmpty(admdvsExpertCntDTOS)) {
            map = admdvsExpertCntDTOS.stream().collect(Collectors.toMap(AdmdvsExpertCntDTO::getAdmdvs, AdmdvsExpertCntDTO::getExpertCnt));
        }

        List<AdmdvsFormData> list = tldyReportFormDAO.queryAdmdvsTldyFormData(request);
        if (!CollectionUtils.isEmpty(list)) {
            for(AdmdvsFormData item : list) {
                BigDecimal passRate = calculateRatio(item.getCasesCnt(), item.getPassCasesCnt());
                item.setPassRate(passRate);
                String admdvs = item.getAdmdvs();
                Long expertCnt = map.getOrDefault(admdvs, 0L);
                item.setExpertCnt(expertCnt);
//                DataDictDO dataDic = AdmdvsCacheUtil.getDataDic(admdvs);
//                if (!Objects.isNull(dataDic)) {
//                    item.setAdmdvsName(dataDic.getLabel());
//                }
            }
        }

        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setCharacterEncoding("utf-8");// 设置字符编码
        String fileName1 = URLEncoder.encode("统筹区特病单议报表", "UTF-8").replaceAll("\\+", "%20");
        response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName1 + ".xlsx"); // 设置响应头

        EasyExcel.write(response.getOutputStream(), AdmdvsFormData.class)
                .registerWriteHandler(HeadContentCellStyle.myHorizontalCellStyleStrategy())
                .registerWriteHandler(new SimpleColumnWidthStyleStrategy(20))
                .sheet("统筹区特病单议报表")
                .doWrite(list); //用io流来写入数据
    }

    //这儿得改
    private BigDecimal calculateRatio(Long casesCnt, Long passCasesCnt) {
        if (Objects.isNull(casesCnt) || casesCnt <= 0) {
            return BigDecimal.ZERO;
        }
        if (Objects.isNull(passCasesCnt) || passCasesCnt <= 0) {
            return BigDecimal.ZERO;
        }
        return BigDecimal.valueOf(passCasesCnt).multiply(new BigDecimal("100")).divide(BigDecimal.valueOf(casesCnt), 2, RoundingMode.HALF_UP);
    }

    private void checkParam(QueryTldyReportFormDTO request) throws Exception {
        if (Objects.isNull(request)) {
            throw new RuntimeException("请求参数不能为空");
        }
        if (StringUtils.isEmpty(request.getAdmdvs())) {
            throw new RuntimeException("区划编码不能为空");
        }
    }

    private void initPage(QueryTldyReportFormDTO request) {
        if (request.getPageNum() <= 0) {
            request.setPageNum(1);
        }
        if (request.getPageSize() <= 0) {
            request.setPageSize(10);
        }
    }
}

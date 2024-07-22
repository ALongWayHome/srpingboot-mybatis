package com.wayhome.srpingbootmybatis.mbs.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.alibaba.excel.write.style.column.SimpleColumnWidthStyleStrategy;
import com.wayhome.srpingbootmybatis.config.ApiResult;
import com.wayhome.srpingbootmybatis.mbs.dto.ExpertTemplate;
import com.wayhome.srpingbootmybatis.mbs.dto.ImportExpertResult;
import com.wayhome.srpingbootmybatis.mbs.service.FixmedinsExpertService;
import com.wayhome.srpingbootmybatis.mbs.util.ExpertImportListener;
import com.wayhome.srpingbootmybatis.speacecase.HeadContentCellStyle;
import com.wayhome.srpingbootmybatis.speacecase.dto.FixmedinsFormData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class FixmendinsExpertServiceImpl implements FixmedinsExpertService {

    @Override
    public ApiResult<ImportExpertResult> importExpertData(MultipartFile file) throws Exception {

        log.info("-------导入特病单议专家begin-------");

        ExpertImportListener expertImportListener = new ExpertImportListener();
        try {
            InputStream inputStream = file.getInputStream();
            EasyExcel.read(inputStream, ExpertTemplate.class, expertImportListener).sheet().doRead();
        }catch (Exception e) {
            log.error("导入特例单议专家，解析excel出现异常");
        }
        List<String> errList = expertImportListener.getErrList();
        if (!CollectionUtils.isEmpty(errList)) {
            log.info("导入特例单议专家失败，解析excel时，发现有不符合模版的数据");
            ImportExpertResult importExpertResult = new ImportExpertResult(Boolean.FALSE, errList);
            return ApiResult.success(importExpertResult);
        }

        //导入数据格式没有问题
        log.info("----------导入特病单议专家格式没问题-----------");
        List<ExpertTemplate> importData = expertImportListener.getData();

        return null;
    }

    @Override
    public void downloadExpertTemplate() throws Exception {
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setCharacterEncoding("utf-8");// 设置字符编码
        String fileName1 = URLEncoder.encode("医疗机构特病单议专家申请表", "UTF-8").replaceAll("\\+", "%20");
        response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName1 + ".xlsx"); // 设置响应头

        EasyExcel.write(response.getOutputStream(), ExpertTemplate.class)
                .registerWriteHandler(HeadContentCellStyle.myHorizontalCellStyleStrategy())
                .registerWriteHandler(new SimpleColumnWidthStyleStrategy(20))
                .sheet("医疗机构特病单议专家申请表")
                .doWrite(new ArrayList()); //用io流来写入数据
    }
}

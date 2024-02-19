package com.wayhome.srpingbootmybatis.controller;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.wayhome.srpingbootmybatis.excel.PreSettleExcelDTO;
import com.wayhome.srpingbootmybatis.excel.SysUserExcel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/opt/excel")
public class ExcelController {

    @PostMapping("/importExcel")
    public void importExcel(@RequestParam("file") MultipartFile file, HttpServletResponse response) {
        ImportParams importParams = new ImportParams();
        importParams.setHeadRows(2);
        importParams.setTitleRows(0);
        try {
            List<SysUserExcel> list = ExcelImportUtil.importExcel(file.getInputStream(), SysUserExcel.class, importParams);
            for (SysUserExcel sysUserExcel : list) {
                System.out.println(sysUserExcel.toString());
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @PostMapping("/importSettleData")
    public void importSettleData(@RequestParam("file") MultipartFile file, HttpServletResponse response) {
        ImportParams importParams = new ImportParams();
        importParams.setTitleRows(0);
        importParams.setHeadRows(2);
        try{
            List<Object> list = ExcelImportUtil.importExcel(file.getInputStream(), PreSettleExcelDTO.class, importParams);
            for (Object o : list) {
                System.out.println(o.toString());
            };
        }catch (Exception e) {
            log.info("解析excel异常:{}", e.getMessage(), e);
        }
    }



}

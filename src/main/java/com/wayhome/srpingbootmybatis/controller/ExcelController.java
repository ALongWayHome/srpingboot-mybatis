package com.wayhome.srpingbootmybatis.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.hutool.poi.excel.ExcelUtil;
import com.wayhome.srpingbootmybatis.excel.CarExcelDTO;
import com.wayhome.srpingbootmybatis.excel.PreSettleExcelDTO;
import com.wayhome.srpingbootmybatis.excel.SysUserExcel;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.validation.annotation.ValidationAnnotationUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @PostMapping(value = "/exportCase")
    public void exportCase( HttpServletResponse response) throws Exception{
        ExportParams exportParams = new ExportParams();
        exportParams.setFixedTitle(true);
        exportParams.setSheetName("车辆情况导出");
        exportParams.setTitle("车辆总数：7 总公里数：1008.56KM");
        CarExcelDTO carExcelDTO = new CarExcelDTO();
        carExcelDTO.setCarNo("京ASKJ92");
        carExcelDTO.setPsnName("王二狗");
        carExcelDTO.setPhone("15356448851");
        List<CarExcelDTO> carExcelDTOS = new ArrayList<>();
        carExcelDTOS.add(carExcelDTO);
        Workbook workbook = ExcelExportUtil.exportExcel(exportParams, CarExcelDTO.class, carExcelDTOS);
        response.setCharacterEncoding("UTF-8");
        response.setHeader("content-Type", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setHeader("Content-Disposition",
                "attachment;filename=" + URLEncoder.encode("车辆情况.xlsx", "UTF-8"));
        workbook.write(response.getOutputStream());
    }



}

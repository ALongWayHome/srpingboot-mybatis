package com.wayhome.srpingbootmybatis.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.hutool.poi.excel.ExcelUtil;
import com.wayhome.srpingbootmybatis.dto.FixInfo;
import com.wayhome.srpingbootmybatis.excel.CarExcelDTO;
import com.wayhome.srpingbootmybatis.excel.PreSettleExcelDTO;
import com.wayhome.srpingbootmybatis.excel.SysUserExcel;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.validation.annotation.ValidationAnnotationUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.*;

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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @PostMapping("/importSettleData")
    public void importSettleData(@RequestParam("file") MultipartFile file, HttpServletResponse response) {
        ImportParams importParams = new ImportParams();
        importParams.setTitleRows(0);
        importParams.setHeadRows(2);
        try {
            List<Object> list = ExcelImportUtil.importExcel(file.getInputStream(), PreSettleExcelDTO.class, importParams);
            for (Object o : list) {
                System.out.println(o.toString());
            }
            ;
        } catch (Exception e) {
            log.info("解析excel异常:{}", e.getMessage(), e);
        }
    }

    @PostMapping(value = "/exportCase")
    public void exportCase(HttpServletResponse response) throws Exception {
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

    public static void main(String[] args) {
        try {
            Map<String, String> fixInfoMap = getFixInfoMap();
            System.out.println("读取间联xlsx");
//            File file = new File("/Users/liangcai/Desktop/place-cloud/batch-add/石药医疗机构信息-支付宝-间联的副本.xlsx");
//            FileInputStream fileInputStream = new FileInputStream(file);
//            Workbook workbook = WorkbookFactory.create(fileInputStream);
            String filePath = "/Users/liangcai/Desktop/place-cloud/batch-add/乐仁堂医疗机构信息-支付宝-间联的副本.xlsx";
            Workbook workbook = new XSSFWorkbook(filePath);
            Sheet sheet = workbook.getSheetAt(0);
            for (int i = sheet.getFirstRowNum() + 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                if(Objects.isNull(row)) {
                    continue;
                }
                Cell cell = row.getCell(1);
                if (Objects.isNull(cell)){
                    continue;
                }
                CellType cellTypeEnum = cell.getCellTypeEnum();
                System.out.println("第" + i +"列的数据类型为： " + cellTypeEnum);
                if (!CellType.STRING.equals(cellTypeEnum)) {
                    continue;
                }
                String fixmedinsCode = cell.getStringCellValue();
//                System.out.println("第" + i + "列的fixmedinsCode :" + fixmedinsCode);
                if (StringUtils.isEmpty(fixmedinsCode)) {
                    continue;
                }
                String qudaobianma = fixInfoMap.get(fixmedinsCode);
                System.out.println("定点机构编码：" + fixmedinsCode + "----对应的渠道编码：" + qudaobianma);
                row.getCell(10).setCellValue(qudaobianma);
            }
//            foreachWorkbook(workbook);
            String filePath2 = "/Users/liangcai/Desktop/place-cloud/batch-add/乐仁堂医疗机构信息-支付宝-间联的副本2.xlsx";
            FileOutputStream fileOutputStream = new FileOutputStream(filePath2);
            workbook.write(fileOutputStream);
        } catch (Exception e) {
            System.out.println("异常1");
            e.printStackTrace();
            System.out.println("异常2");
        }

    }

    public static List<FixInfo> getFixInfoList() {
        List<FixInfo> list = new ArrayList<>();
        System.out.println("读取渠道编码xlsx");
        File file = new File("/Users/liangcai/Desktop/place-cloud/prod-fankuidan/24072508430300009272-医保电子凭证地方线上身份核验服务反馈单_河北省_正式环境.xlsx");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            Workbook workbook = WorkbookFactory.create(fileInputStream);
            Sheet sheet = workbook.getSheetAt(0);
            int lastRowNum = sheet.getLastRowNum();

            for (int i = sheet.getFirstRowNum() + 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                FixInfo fixInfo = new FixInfo();
                for (int j = row.getFirstCellNum(); j <= row.getLastCellNum(); j++) {
                    if (j == 2) {
                        Cell cell = row.getCell(j);
                        String stringCellValue = cell.getStringCellValue();
                        fixInfo.setFixmedinsCode(stringCellValue);
                    }
                    if (j == 5) {
                        Cell cell = row.getCell(j);
                        String stringCellValue = cell.getStringCellValue();
                        fixInfo.setQudaobianma(stringCellValue);
                    }
                }
                list.add(fixInfo);
            }
        } catch (Exception e) {
            System.out.println("异常");
        }
        return list;
    }


    public static Map<String, String> getFixInfoMap() {
        Map<String, String> map = new HashMap<>();
        System.out.println("读取渠道编码xlsx");
        File file = new File("/Users/liangcai/Desktop/place-cloud/prod-fankuidan/24072508430300009272-医保电子凭证地方线上身份核验服务反馈单_河北省_正式环境.xlsx");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            Workbook workbook = WorkbookFactory.create(fileInputStream);
            Sheet sheet = workbook.getSheetAt(0);
            for (int i = sheet.getFirstRowNum() + 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                String fixmedinsCode = row.getCell(2).getStringCellValue();
                String qudaobianma = row.getCell(5).getStringCellValue();
                map.put(fixmedinsCode, qudaobianma);
            }
        } catch (Exception e) {
            System.out.println("异常");
        }
        return map;
    }

    public static void foreachWorkbook(Workbook workbook) {
        Sheet sheet = workbook.getSheetAt(0);
        for (int i = sheet.getFirstRowNum(); i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            if(Objects.isNull(row)) {
                continue;
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (int j = row.getFirstCellNum(); j <= row.getLastCellNum(); j++) {
                Cell cell = row.getCell(j);
                if (Objects.isNull(cell)){
                    continue;
                }
                if (CellType.STRING.equals(cell.getCellTypeEnum())){
                    String stringCellValue = cell.getStringCellValue();
                    stringBuffer.append(stringCellValue);
                    stringBuffer.append("==");
                }
            }
            System.out.println(stringBuffer.toString());
        }
    }


}

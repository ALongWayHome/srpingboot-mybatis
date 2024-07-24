package com.wayhome.srpingbootmybatis.mbs.tblyrule.bo.impl;

import com.alibaba.excel.EasyExcel;
import com.wayhome.srpingbootmybatis.config.ApiResult;
import com.wayhome.srpingbootmybatis.mbs.fixmedinslvmapping.dto.LvMappingImportDTO;
import com.wayhome.srpingbootmybatis.mbs.tblyrule.bo.TbdyRuleBO;
import com.wayhome.srpingbootmybatis.mbs.tblyrule.dao.TbdyRuleDao;
import com.wayhome.srpingbootmybatis.mbs.tblyrule.dto.DipSetlAvgCostNewDTO;
import com.wayhome.srpingbootmybatis.mbs.tblyrule.dto.DipSetlAvgDaysNewDTO;
import com.wayhome.srpingbootmybatis.mbs.tblyrule.dto.DrgSetlAvgCostNewDTO;
import com.wayhome.srpingbootmybatis.mbs.tblyrule.dto.DrgSetlAvgDaysNewDTO;
import com.wayhome.srpingbootmybatis.mbs.util.DipSetlAvgCostNewListener;
import com.wayhome.srpingbootmybatis.mbs.util.DipSetlAvgDaysNewListener;
import com.wayhome.srpingbootmybatis.mbs.util.DrgSetlAvgCostNewListener;
import com.wayhome.srpingbootmybatis.mbs.util.DrgSetlAvgDaysNewListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.InputStream;

@Slf4j
@Service
public class TbdyRuleBOImpl implements TbdyRuleBO {


    @Resource
    private TbdyRuleDao tbdyRuleDao;



    @Override
    public ApiResult<Boolean> importTldyRuleData(MultipartFile file) throws Exception {
        if (file == null) {
            log.info("导入的文件为null");
            return ApiResult.fail("导入的文件为null");
        }
        String fileName = file.getOriginalFilename();
        String substring = fileName.substring(fileName.lastIndexOf(".") + 1);
        if (!"xlsx".equals(substring)) {
            log.info("导入的数据格式不正确");
            return ApiResult.fail("导入的数据格式不正确");
        }

        readSheet0(file);
        readSheet1(file);
        readSheet2(file);
        readSheet3(file);
        return ApiResult.success(Boolean.TRUE);
    }

    /**
     *dip次均费用
     * @param file
     */
    private void readSheet0(MultipartFile file) {
        DipSetlAvgCostNewListener dipSetlAvgCostNewListener = new DipSetlAvgCostNewListener(tbdyRuleDao);

        try {
            InputStream inputStream = file.getInputStream();
            EasyExcel.read(inputStream, DipSetlAvgCostNewDTO.class, dipSetlAvgCostNewListener).sheet(0).doRead();
        }catch (Exception e) {
            log.error("特病单议导入DIP次均费用解析excel出现异常");
            e.printStackTrace();
        }

    }
    //dip平均住院天数
    private void readSheet1(MultipartFile file) {
        DipSetlAvgDaysNewListener dipSetlAvgDaysNewListener = new DipSetlAvgDaysNewListener(tbdyRuleDao);
        try {
            InputStream inputStream = file.getInputStream();
            EasyExcel.read(inputStream, DipSetlAvgDaysNewDTO.class, dipSetlAvgDaysNewListener).sheet(1).doRead();
        }catch (Exception e) {
            log.error("特病单议导入导入DIP平均住院天数解析excel出现异常");
            e.printStackTrace();
        }
    }
    //drg次均费用
    private void readSheet2(MultipartFile file) {
        DrgSetlAvgCostNewListener drgSetlAvgCostNewListener = new DrgSetlAvgCostNewListener(tbdyRuleDao);
        try {
            InputStream inputStream = file.getInputStream();
            EasyExcel.read(inputStream, DrgSetlAvgCostNewDTO.class, drgSetlAvgCostNewListener).sheet(3).doRead();
        }catch (Exception e) {
            log.error("特病单议Drg次均费用析解析excel出现异常");
            e.printStackTrace();
        }
    }

    //drg平均住院天数
    private void readSheet3(MultipartFile file) {
        DrgSetlAvgDaysNewListener drgSetlAvgDaysNewListener = new DrgSetlAvgDaysNewListener(tbdyRuleDao);
        try {
            InputStream inputStream = file.getInputStream();
            EasyExcel.read(inputStream, DrgSetlAvgDaysNewDTO.class, drgSetlAvgDaysNewListener).sheet(2).doRead();
        }catch (Exception e) {
            log.error("特病单议导入DrgP平均住院天数解析excel出现异常");
            e.printStackTrace();
        }
    }


}

package com.wayhome.srpingbootmybatis.mbs.util;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.sun.javafx.binding.StringFormatter;
import com.wayhome.srpingbootmybatis.mbs.dto.ExpertTemplate;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Slf4j
public class ExpertImportListener extends AnalysisEventListener<ExpertTemplate> {

    private List<ExpertTemplate> data = new ArrayList<>();

    private List<String> errList = new ArrayList<>();

    public List<ExpertTemplate> getData() {
        return data;
    }

    public List<String> getErrList() {
        return this.errList;
    }

    @Override
    public void invoke(ExpertTemplate expertTemplate, AnalysisContext analysisContext) {
        boolean matched = checkTempleFormat(expertTemplate);
        if (matched){
            data.add(expertTemplate);
        }
    }


    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        log.info("导入特例单议专家数据，读取Excel完成");
    }

    private boolean checkTempleFormat(ExpertTemplate expertTemplate) {
        if (Objects.isNull(expertTemplate)) {
            errList.add("有数据为空，请检查填写是否正确");
        }
        if (StringUtils.isEmpty(expertTemplate.getRow())) {
            errList.add("导入的专家数据中格式有误,序号不能为空");
            return false;
        }
        String errorMsg = "";
        String beforeMsg = StringFormatter.format("[序号为:%s的专家数据中,格式有误],",expertTemplate.getRow()).getValue();
        if (StringUtils.isEmpty(expertTemplate.getDrCode())) {
            String msg = "医师编码不能为空;";
            errorMsg = StringUtils.isEmpty(errorMsg) ? beforeMsg + msg : errorMsg + msg;
        }

        if (StringUtils.isEmpty(expertTemplate.getDrName())) {
            String msg = "医师姓名不能为空;";
            errorMsg = StringUtils.isEmpty(errorMsg) ? beforeMsg + msg : errorMsg + msg;
        }

        if (StringUtils.isEmpty(expertTemplate.getFixmedinsCode())) {
            String msg = "定点机构编码不能为空;";
            errorMsg = StringUtils.isEmpty(errorMsg) ? beforeMsg + msg : errorMsg + msg;
        }
        if (StringUtils.isEmpty(expertTemplate.getFixmedinsName())) {
            String msg = "定点机构名称不能为空;";
            errorMsg = StringUtils.isEmpty(errorMsg) ? beforeMsg + msg : errorMsg + msg;
        }
        if (StringUtils.isEmpty(expertTemplate.getDeptMajorName())) {
            String msg = "专业类别不能为空;";
            errorMsg = StringUtils.isEmpty(errorMsg) ? beforeMsg + msg : errorMsg + msg;
        }
        if (StringUtils.isEmpty(expertTemplate.getFixBlngAdmdvs())) {
            String msg = "定点所属区划编码不能为空;";
            errorMsg = StringUtils.isEmpty(errorMsg) ? beforeMsg + msg : errorMsg + msg;
        }
        if (StringUtils.isEmpty(expertTemplate.getPhone())) {
            String msg = "专家联系电话不能为空;";
            errorMsg = StringUtils.isEmpty(errorMsg) ? beforeMsg + msg : errorMsg + msg;
        }

        if (StringUtils.isEmpty(errorMsg)){
            return true;
        }
        errList.add(errorMsg);
        return false;
    }

}

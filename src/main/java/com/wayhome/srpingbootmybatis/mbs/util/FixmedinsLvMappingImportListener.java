package com.wayhome.srpingbootmybatis.mbs.util;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.wayhome.srpingbootmybatis.mbs.dto.FixmedinsLvMappingDTO;
import com.wayhome.srpingbootmybatis.mbs.dto.LvMappingImportDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;


@Slf4j
public class FixmedinsLvMappingImportListener extends AnalysisEventListener<LvMappingImportDTO> {

    private List<FixmedinsLvMappingDTO> list = new ArrayList<>();

    public List<FixmedinsLvMappingDTO> getList() {
        return list;
    }

    @Override
    public void invoke(LvMappingImportDTO lvMappingImportDTO, AnalysisContext analysisContext) {
        FixmedinsLvMappingDTO fixmedinsLvMappingDTO = null;
        try {
            fixmedinsLvMappingDTO = checkandSetDTO(lvMappingImportDTO);
        } catch (Exception e) {
            log.info("定点机构对应关系导入数据错误:{}", e.getMessage());
            e.printStackTrace();
        }
        if (!Objects.isNull(fixmedinsLvMappingDTO)) {
            list.add(fixmedinsLvMappingDTO);
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        log.info("解析完成");
    }

    private FixmedinsLvMappingDTO checkandSetDTO(LvMappingImportDTO mappingDTO) throws Exception {
        if (mappingDTO == null) {
            throw new Exception("解析数据失败");
        }
        if (StringUtils.isEmpty(mappingDTO.getFixmedinsCode())) {
            throw new Exception("解析数据失败,定点机构编码不能为空");
        }
        if (StringUtils.isEmpty(mappingDTO.getFixmedinsName())) {
            throw new Exception("解析数据失败,定点机构名称不能为空");
        }
        if (StringUtils.isEmpty(mappingDTO.getFixBlngAdmdvs())) {
            throw new Exception("解析数据失败,顶点机构所属清算经办机构编码不能为空");
        }
        if (StringUtils.isEmpty(mappingDTO.getSetlLv())) {
            throw new Exception("解析数据失败,结算等级不能为空");
        }
        FixmedinsLvMappingDTO fixmedinsLvMappingDTO = new FixmedinsLvMappingDTO();
        BeanUtils.copyProperties(mappingDTO, fixmedinsLvMappingDTO);
        Date date = new Date();
        fixmedinsLvMappingDTO.setValiFlag("1");
        fixmedinsLvMappingDTO.setCrteTime(date);
        fixmedinsLvMappingDTO.setUpdtTime(date);
        return fixmedinsLvMappingDTO;
    }
}

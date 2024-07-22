package com.wayhome.srpingbootmybatis.mbs.expertimport.bo;

import com.wayhome.srpingbootmybatis.mbs.expertimport.dto.ExpertTemplate;

import java.util.List;

public interface ImportExpertBO {

    void importExpert(List<ExpertTemplate> list);
}

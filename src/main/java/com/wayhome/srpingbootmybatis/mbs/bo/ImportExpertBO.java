package com.wayhome.srpingbootmybatis.mbs.bo;

import com.wayhome.srpingbootmybatis.mbs.dto.ExpertTemplate;

import java.util.List;

public interface ImportExpertBO {

    void importExpert(List<ExpertTemplate> list);
}

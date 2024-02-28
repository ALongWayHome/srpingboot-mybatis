package com.wayhome.srpingbootmybatis.dto;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.util.List;

@Data
public class JSONBody {

    private List<JSONObject> list1;


    private List<JSONObject> list2;
}

package com.wayhome.srpingbootmybatis.controller;

import com.alibaba.fastjson.JSONObject;
import com.wayhome.srpingbootmybatis.dto.JSONBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/json")
public class JsonController {

    @PostMapping(value = "/validRepeatSetlId")
    public void vilidationRepeatData(@RequestBody JSONBody jsonBody) {
        List<JSONObject> list1 = jsonBody.getList1();
        List<JSONObject> list2 = jsonBody.getList2();

        List<String> setlIds1 = list1.stream().map(jsonObject -> jsonObject.getString("setl_id")).collect(Collectors.toList());
        List<String> setlIds2 = list2.stream().map(jsonObject -> jsonObject.getString("setl_id")).collect(Collectors.toList());
        List<String> repeatSetlId = new ArrayList<>();
        setlIds1.forEach(setlId->{
            if (setlIds2.contains(setlId)) {
                repeatSetlId.add(setlId);
            }
        });
        System.out.println("----------------------------------");
        System.out.println(repeatSetlId.size());
        System.out.println(repeatSetlId);
    }



}

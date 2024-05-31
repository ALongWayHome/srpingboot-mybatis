package com.wayhome.srpingbootmybatis.controller;


import com.wayhome.srpingbootmybatis.utils.HttpUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@Slf4j
@RestController
@RequestMapping("/httpUtil")
public class HttpUtilController {

    @PostMapping(value = "/postRequest")
    public String postRequest() throws Exception {

        String requestUrl = "http://ylbzj.hebei.gov.cn/yyds/mobile/api/amp/hos/pushMsg";
        Map<String, String> requestHeader = getRequestHeader();
        String s = HttpUtil.doPostJson(requestUrl, requestHeader, "");
        return s ;
    }


    private Map<String, String> getRequestHeader() {
        Map<String, String> requestHeader = new HashMap<>();
        requestHeader.put("X-Api-Sign-Version", "2.0.0");
        return requestHeader;
    }
}

package com.wayhome.srpingbootmybatis.controller;


import com.wayhome.srpingbootmybatis.config.ApiResult;
import com.wayhome.srpingbootmybatis.entity.TestIn;
import com.wayhome.srpingbootmybatis.entity.User;
import com.wayhome.srpingbootmybatis.manager.TestInManager;
import com.wayhome.srpingbootmybatis.service.AsyncService;
import com.wayhome.srpingbootmybatis.service.TestInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    //    @Autowired
//    @Qualifier("asyncService")
    @Resource(name = "asyncService")
    private AsyncService asyncService;

    @Autowired
    private TestInManager testInManager;
    @Autowired
    private TestInService testInService;




    @GetMapping("/dateFormatterTest")
    public String dateFormatterTest(@RequestBody User user) {

        return "success";
    }

    @GetMapping("/execute/async")
    public void testAsync() {
        asyncService.executeAsync();
    }

    //    @GetMapping(value = "/branchAddTestIn")
    public void branchAddTestIn() throws Exception {
        testInManager.branchAdd();
    }

    @GetMapping("/testIn/{id}")
    public ApiResult testIn(@PathVariable Long id) {
        TestIn byId = testInService.getById(id);
        return ApiResult.success(byId);
    }

    @GetMapping("/testIn/processIn")
    public ApiResult processIn() throws Exception {
        List<String> strings = testInManager.queryInProcess();
        return ApiResult.success(strings);
    }

    @GetMapping("/redis_test")
    public String redisTest(){

        return "success";
    }
}

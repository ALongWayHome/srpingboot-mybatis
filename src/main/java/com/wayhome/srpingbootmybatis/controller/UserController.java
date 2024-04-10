package com.wayhome.srpingbootmybatis.controller;

import com.wayhome.srpingbootmybatis.config.ApiResult;
import com.wayhome.srpingbootmybatis.entity.User;
import com.wayhome.srpingbootmybatis.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/getUser/{id}")
    public ApiResult<User> getUserById(@PathVariable Long id){
        log.info("查询用户信息接口～～");
        return ApiResult.success(userService.getUserById(id));
    }

    @PostMapping(value = "/editUser")
    public ApiResult<Boolean> editUser(@RequestBody User user){

        return ApiResult.success(userService.editUser(user));
    }

}

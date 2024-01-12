package com.wayhome.srpingbootmybatis.handler;

import com.sun.deploy.net.HttpResponse;
import com.wayhome.srpingbootmybatis.config.ApiResult;
import com.wayhome.srpingbootmybatis.exception.CustomerException;
import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ApiResult globalException(HttpResponse httpResponse, RuntimeException exception){
        return ApiResult.fail();
    }

    @ExceptionHandler(CustomerException.class)
    public ApiResult customerException(HttpResponse httpResponse, CustomerException customerException){
        return ApiResult.fail(customerException.getErrorCode(), customerException.getMessage());
    }
}

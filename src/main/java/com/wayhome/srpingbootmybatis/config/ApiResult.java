package com.wayhome.srpingbootmybatis.config;

import com.wayhome.srpingbootmybatis.constant.HttpConstants;
import lombok.Data;

import java.io.Serializable;

@Data
public class ApiResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private int code;

    private T data;

    private String message;

    public ApiResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public ApiResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }


    public static <T> ApiResult<T> success() {
        return new ApiResult<T>(HttpConstants.SUCCESS_CODE, HttpConstants.SUCCESS_MESSAGE, null);
    }

    public static <T> ApiResult<T> success(String message) {
        return new ApiResult<T>(HttpConstants.SUCCESS_CODE, message, null);
    }

    public static <T> ApiResult<T> success(T data) {
        return new ApiResult<T>(HttpConstants.SUCCESS_CODE, HttpConstants.SUCCESS_MESSAGE, data);
    }

    public static <T> ApiResult<T> success(String message, T data) {
        return new ApiResult<T>(HttpConstants.SUCCESS_CODE, message, data);
    }


    public static <T> ApiResult<T> fail() {
        return new ApiResult<T>(HttpConstants.DEFAULT_ERROR_CODE, HttpConstants.DEFAULT_ERROR_MESSAGE, null);
    }

    public static <T> ApiResult<T> fail(String message) {
        return new ApiResult<T>(HttpConstants.DEFAULT_ERROR_CODE, message, null);
    }

    public static <T> ApiResult<T> fail(int code, String message) {
        return new ApiResult<T>(code, message, null);
    }

    public static <T> ApiResult<T> of(int row) {
        if (row > 0){
            return success();
        }else{
            return fail();
        }

    }

    public static <T> ApiResult<T> of(int row, int code, String message) {
        if (row > 0){
            return success(message);
        }else{
            return fail(code, message);
        }

    }

}

package com.wayhome.srpingbootmybatis.exception;

public class CustomerException extends RuntimeException {

    private static final int DEFAULT_ERROR_CODE = 500;

    private int errorCode = DEFAULT_ERROR_CODE;

    public CustomerException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomerException(String message) {
        super(message);
    }

    public CustomerException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public int getErrorCode() {
        return errorCode;
    }
}

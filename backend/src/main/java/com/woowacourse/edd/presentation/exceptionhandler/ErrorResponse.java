package com.woowacourse.edd.presentation.exceptionhandler;

public class ErrorResponse {

    private String result;
    private String message;

    public ErrorResponse(String result, String message) {
        this.result = result;
        this.message = message;
    }

    public String getResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }
}

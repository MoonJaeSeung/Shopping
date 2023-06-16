package com.shop.shop.exception;

public class DuplicateCouponException extends RuntimeException{

    private int errorCode;

    public DuplicateCouponException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}

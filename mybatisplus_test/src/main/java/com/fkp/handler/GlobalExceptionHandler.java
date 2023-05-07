package com.fkp.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = RuntimeException.class)
    public String runtimeExceptionHandler(RuntimeException e){
        e.printStackTrace();
        return "GlobalExceptionHandler capture exception!" + e.getClass().getName();
    }
}

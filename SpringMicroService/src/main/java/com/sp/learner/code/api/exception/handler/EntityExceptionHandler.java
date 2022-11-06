package com.sp.learner.code.api.exception.handler;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class EntityExceptionHandler {

@ExceptionHandler(value = { Exception.class })
public ResponseEntity<Object> handleAnyException(Exception ex, WebRequest request) {
        return new ResponseEntity<>(
          "Err message : "+ex.getMessage(), new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
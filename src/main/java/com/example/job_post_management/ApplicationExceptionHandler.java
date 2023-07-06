package com.example.job_post_management;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.job_post_management.exception.ErrorResponse;
import com.example.job_post_management.exception.PostNotFoundException;

@ControllerAdvice
public class ApplicationExceptionHandler {
    
    @ExceptionHandler(PostNotFoundException.class)
    public ResponseEntity<Object> handlePostNotFoundException(PostNotFoundException ex){
          ErrorResponse error = new ErrorResponse(ex.getMessage());
            return new ResponseEntity<Object>(error, HttpStatus.NOT_FOUND);
    }
}

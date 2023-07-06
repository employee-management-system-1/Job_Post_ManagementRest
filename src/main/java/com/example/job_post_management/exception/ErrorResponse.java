package com.example.job_post_management.exception;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ErrorResponse {
    
    private LocalDateTime timestamp;
    private String message;


    public ErrorResponse(String message) {
        this.timestamp = LocalDateTime.now();
        this.message = message;
    }

}

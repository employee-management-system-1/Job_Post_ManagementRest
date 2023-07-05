package com.example.job_post_management.exception;

public class PostNotFoundException extends RuntimeException{
    
    public PostNotFoundException(Long id){
        super("The Post with  id: '" + id + "' does not exist in our records");
    
    }
}

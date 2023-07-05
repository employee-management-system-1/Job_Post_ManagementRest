package com.example.job_post_management.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.job_post_management.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long>  {
    
}

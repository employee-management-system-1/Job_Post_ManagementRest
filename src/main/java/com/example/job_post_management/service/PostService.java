package com.example.job_post_management.service;



import java.util.List;

import com.example.job_post_management.entity.Post;

public interface PostService {
    
    Post getPost(Long id);
    Post savePost(Post post);
    Post updatePost(Long id,Post post);
    void deletePost(Long id);
    List<Post> getAllPost();
}

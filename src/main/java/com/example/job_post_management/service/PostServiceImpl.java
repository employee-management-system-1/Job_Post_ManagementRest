package com.example.job_post_management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.job_post_management.entity.Post;
import com.example.job_post_management.exception.PostNotFoundException;
import com.example.job_post_management.repository.PostRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class PostServiceImpl implements PostService {

    PostRepository postRepository;

    @Override
    public Post getPost(Long id) {
        if(postRepository.existsById(id)){
            return postRepository.findById(id).get();
        }else{
            throw new PostNotFoundException(id);
        }
    }

    @Override
    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public void deletePost(Long id) {
        if(postRepository.existsById(id)){
            postRepository.deleteById(id);
        }else{
            throw new PostNotFoundException(id);
        }
    }

    @Override
    public List<Post> getAllPost() {
        return (List<Post>)postRepository.findAll();
    }

    @Override
    public Post updatePost(Long id, Post post) {
        if(postRepository.existsById(id)){
            post.setId(id);
            return postRepository.save(post);
        }else{
            throw new PostNotFoundException(id);
        }
    }
    
}

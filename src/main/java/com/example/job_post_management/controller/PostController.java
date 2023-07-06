package com.example.job_post_management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.job_post_management.entity.Post;
import com.example.job_post_management.service.PostService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/{id}")
    public ResponseEntity<Post>getPost(@PathVariable Long id){
        return new ResponseEntity<Post>(postService.getPost(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Post>savePost(@RequestBody Post post){
        return new ResponseEntity<Post>(postService.savePost(post), HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<Post>updatePost(@PathVariable Long id,@RequestBody Post post){
        return new ResponseEntity<Post>(postService.updatePost(id,post), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus>deletePost(@PathVariable Long id){
        postService.deletePost(id);
        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Post>>getPosts(){
        return new ResponseEntity<List<Post>>(postService.getAllPost(),HttpStatus.OK);
    }
    
}

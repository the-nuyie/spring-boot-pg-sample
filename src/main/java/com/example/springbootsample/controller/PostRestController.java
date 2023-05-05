package com.example.springbootsample.controller;

import com.example.springbootsample.data.entity.Post;
import com.example.springbootsample.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostRestController {

    private final PostService postService;


    public PostRestController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/posts")
    public ResponseEntity<Post> createPost(@RequestBody Post post){
        postService.savePost(post);
        return new ResponseEntity<>(post,HttpStatus.CREATED);
    }

    @GetMapping("/posts")
    public ResponseEntity<List<Post>> getAllPosts(){
        return new ResponseEntity<>(postService.getAllPosts(), HttpStatus.OK);
    }

//    @DeleteMapping("/posts/{postId}")
//    public ResponseEntity<Void> deletePost(@PathVariable Long postId){
//        Post postToDelete = postService.getPostRepository().findByPostId(postId);
//        postService.deletePost(postToDelete);
//
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }


}

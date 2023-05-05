package com.example.springbootsample.controller;

import com.example.springbootsample.data.entity.Post;
import com.example.springbootsample.data.repository.PostRepository;
import com.example.springbootsample.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class PostRestController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/posts")
    public String listAll(Model model) {
        List<Post> listPosts = postRepository.findAll();
        model.addAttribute("listPosts", listPosts);

        return "posts";
    }
}

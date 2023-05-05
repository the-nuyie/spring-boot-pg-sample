package com.example.springbootsample.data.repository;

import com.example.springbootsample.data.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}

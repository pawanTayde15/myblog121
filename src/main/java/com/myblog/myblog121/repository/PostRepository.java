package com.myblog.myblog121.repository;

import com.myblog.myblog121.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}

package com.posts.repository;

import com.posts.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  PostRepo extends JpaRepository<Post, Integer> {
}

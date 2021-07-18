package com.example.ictvolunteerserver.repository;

import com.example.ictvolunteerserver.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}

package com.natwest.blogappapis.repositrories;

import com.natwest.blogappapis.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment, Integer> {
}

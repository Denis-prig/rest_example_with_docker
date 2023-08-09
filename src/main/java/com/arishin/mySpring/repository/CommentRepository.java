package com.arishin.mySpring.repository;

import com.arishin.mySpring.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
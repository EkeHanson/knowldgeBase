package com.hansontech.knowldgeBase.repository;

import com.hansontech.knowldgeBase.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comments, Long> {
}

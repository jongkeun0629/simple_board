package com.jongkeun.simple_board.repository;

import com.jongkeun.simple_board.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

// 클래스 생성 시 JPA 기능 구현 불가
public interface CommentRepository extends JpaRepository<Comment, Integer> {
}

package com.jongkeun.simple_board.repository;

import com.jongkeun.simple_board.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}

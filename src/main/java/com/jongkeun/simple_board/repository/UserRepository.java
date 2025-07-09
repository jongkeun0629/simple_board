package com.jongkeun.simple_board.repository;

import com.jongkeun.simple_board.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    // 조회 결과가 없는 경우 대비. Optional 설정
    Optional<User> findByUsername(String username);
}

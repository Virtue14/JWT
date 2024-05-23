package com.virtue.securityjwt.repository;

import com.virtue.securityjwt.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    Boolean existsByUsername(String username);

    // 회원을 조회하는 메소드 작성
    UserEntity findByUsername(String username);
}

package com.example.springboot.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author anda
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Boolean existsByUsernameAndPassword(String username, String password); 
    public UserEntity findByEmail(String email); 
    public UserEntity findByResetPasswordToken(String token);
}


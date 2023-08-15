package com.example.springboot.Model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author anda
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
    Boolean existsByUsernameAndPassword(String username, String password);
    UserEntity findByEmailIgnoreCase(String email); 
}


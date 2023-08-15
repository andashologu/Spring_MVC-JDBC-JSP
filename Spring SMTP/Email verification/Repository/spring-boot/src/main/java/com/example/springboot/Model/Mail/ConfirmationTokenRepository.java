package com.example.springboot.Model.Mail;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfirmationTokenRepository extends JpaRepository<ConfirmationTokenEntity, String> {
    ConfirmationTokenEntity findByConfirmationToken(String confirmationToken);
}
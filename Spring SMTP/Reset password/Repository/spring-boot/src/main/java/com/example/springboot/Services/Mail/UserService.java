package com.example.springboot.Services.Mail;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.Model.UserEntity;
import com.example.springboot.Model.UserNotFoundException;
import com.example.springboot.Model.UserRepository;

@Service
@Transactional
public class UserService{
 
    @Autowired
    private UserRepository userRepo;
     
 
    public void updateResetPasswordToken(String token, String email) throws UserNotFoundException {
        UserEntity user = userRepo.findByEmail(email);
        if (user != null) {
            user.setResetPasswordToken(token);
            userRepo.save(user);
        } else {
            throw new UserNotFoundException("Could not find any customer with the email " + email);
        }
    }
     
    public UserEntity getByResetPasswordToken(String token) {
        return userRepo.findByResetPasswordToken(token);
    }
     
    public void updatePassword(UserEntity user, String newPassword) {
        //BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        //String encodedPassword = passwordEncoder.encode(newPassword);
        user.setPassword(newPassword);
         
        user.setResetPasswordToken(null);
        userRepo.save(user);
    }
}


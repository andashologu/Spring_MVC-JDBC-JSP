package com.example.springboot.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.springboot.Model.UserEntity;
import com.example.springboot.Model.UserRepository;

@Controller
public class UserController {

	@Autowired 
	UserRepository userRepository;

	@Autowired
    PasswordEncoder passwordEncoder;

	@GetMapping("signup")
	public String signup() {
		return "signup";
	}
	@PostMapping("signup")
	public String getSignup(UserEntity user) {
		System.out.println("Firstname: "+user.getFirstname());
		System.out.println("Lastname: "+user.getLastname());
		System.out.println("Usertname: "+user.getUsername());
		System.out.println("Password: "+user.getPassword());
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userRepository.save(user);
		return "redirect:/";
	}

	@GetMapping("login")
	public String login() {
		return "login";
	}
	@PostMapping("/login_success_handler")
	public String loginSuccessHandler(){
        return "redirect:/";
	}
}

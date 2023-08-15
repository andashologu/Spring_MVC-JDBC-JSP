package com.example.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.springboot.Model.UserEntity;

@Controller
public class UserController {

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
		return "redirect:/";
	}
}

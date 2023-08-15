package com.example.springboot.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.springboot.Model.UserEntity;
import com.example.springboot.Model.UserRepository;

@Controller
public class UserController {

	@Autowired UserRepository userRepository;

	@GetMapping("main")
	public String home() {
		return "home";
	}
	@GetMapping("signup")
	public String signup() {
		return "signup";
	}
	@PostMapping("signup")
	public String getSignup(UserEntity user) {
		System.out.println("Usertname: "+user.getUsername());
		System.out.println("Password: "+user.getPassword());
		userRepository.save(user);
		return "redirect:/";
	}

	@GetMapping("login")
	public String login() {
		return "login";
	}
	@PostMapping("login")
	public String getLogin(HttpServletRequest request) {
		System.out.println("Username: "+request.getParameter("username"));
		System.out.println("Password: "+request.getParameter("password"));
		if(userRepository.existsByUsernameAndPassword(request.getParameter("username"), request.getParameter("password"))){
			System.out.println("Login success");
			return "redirect:/";
		}
		else{
			System.out.println("Login failure");
			return "login";
		}
	}
}

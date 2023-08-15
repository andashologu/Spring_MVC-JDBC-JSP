package com.example.springboot.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.springboot.Model.UserEntity;
import com.example.springboot.Model.UserRepository;

@Controller
public class UserController {

	@Autowired UserRepository userRepository;

	@GetMapping("signup")
	public String signup() {
		return "signup";
	}
	@PostMapping("signup")
	public ResponseEntity<String> getSignup(@Valid UserEntity user, BindingResult results) {
		System.out.println("Firstname: "+user.getFirstname());
		System.out.println("Lastname: "+user.getLastname());
		System.out.println("Usertname: "+user.getUsername());
		System.out.println("Password: "+user.getPassword());

		if(results.hasErrors()){

				List<FieldError> errorList = results.getFieldErrors();
				JSONArray errorArr = new JSONArray();
				JSONObject errorObj = new JSONObject();
				for(FieldError error: errorList){
					errorObj.put("fieldname", error.getField());
					errorObj.put("errorMessage", error.getDefaultMessage());
					errorArr.put(errorObj);
					errorObj = new JSONObject();
				}
				System.out.println("All errors: "+errorArr);
			return new ResponseEntity<>(errorArr.toString(), HttpStatus.FORBIDDEN);
		}
		userRepository.save(user);
		return ResponseEntity.ok("Success");
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

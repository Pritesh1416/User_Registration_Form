package com.springweb.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springweb.dto.UserDTO;
import com.springweb.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/userDetails")
	public String userController() {
		return "userRegistrationForm";
	}

	@PostMapping("/saveUser")
	public String saveUser(UserDTO userDTO, Map<String, Object> map) {
		userService.saveUser(userDTO);
		map.put("message", "User Registered Successfully...!!");
		return "userRegistrationForm";
	}

}

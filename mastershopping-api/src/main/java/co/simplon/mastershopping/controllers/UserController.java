package co.simplon.mastershopping.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import co.simplon.mastershopping.dtos.UserLogin;
import co.simplon.mastershopping.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private final UserService service;
	
	public UserController (UserService  service) {
		this.service=service;
	}
	
	@PostMapping ("/login")
	public void userLogin(@Valid @RequestBody UserLogin user) {
		service.userLogin(user);
	}
	
	

}

package co.simplon.mastershopping.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties.Jwt;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import co.simplon.mastershopping.dtos.UserLogin;
import co.simplon.mastershopping.entities.User;
import co.simplon.mastershopping.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private final UserService service;
	
	public UserController (UserService  service) {
		this.service=service;
	}
	
	
	
	@PostMapping ("/login")
	public User userLogin(@Valid @RequestBody UserLogin inputs) {
		//User entity = service.userLogin(user);
		//System.out.println(entity);
		return service.userLogin(inputs);
		
	}
	
	@PostMapping ("/sign-in")
	public Object signIn( @RequestBody @Valid UserLogin inputs) {
		
		return service.signIn(inputs);
		
	}
	
	@PostMapping ("/sign-up")
	public void create (@RequestBody UserLogin inputs) {
		 service.create(inputs);
	}
	
	

}

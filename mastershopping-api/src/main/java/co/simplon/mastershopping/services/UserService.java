package co.simplon.mastershopping.services;



import java.util.List;

import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties.Jwt;
import org.springframework.stereotype.Service;


import co.simplon.mastershopping.dtos.UserLogin;
import co.simplon.mastershopping.entities.User;



public interface UserService {


	Object signIn(UserLogin inputs);

	void create(UserLogin inputs);

	

	

}

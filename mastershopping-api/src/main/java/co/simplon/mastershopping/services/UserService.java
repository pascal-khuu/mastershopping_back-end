package co.simplon.mastershopping.services;

import co.simplon.mastershopping.dtos.UserCreate;
import co.simplon.mastershopping.dtos.UserLogin;

import co.simplon.mastershopping.security.Jwt;

public interface UserService {

	Jwt signIn(UserLogin inputs);

	void create(UserCreate inputs);

}

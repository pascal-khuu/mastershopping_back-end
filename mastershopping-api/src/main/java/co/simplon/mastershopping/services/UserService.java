package co.simplon.mastershopping.services;



import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.mastershopping.dtos.User;
import co.simplon.mastershopping.dtos.UserLogin;



public interface UserService {

	void userLogin( UserLogin user);

	List<User> getUsersUserNameAndPassword();

}

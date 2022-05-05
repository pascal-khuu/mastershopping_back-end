package co.simplon.mastershopping.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;


import co.simplon.mastershopping.dtos.UserLogin;
import co.simplon.mastershopping.entities.User;
import co.simplon.mastershopping.repositories.UserRepository;


@Service
public class UserServiceImpl implements UserService {
	private final UserRepository repository;
	
	public UserServiceImpl (UserRepository repository) {
		this.repository=repository;
	}
	@Override
	public User userLogin(UserLogin user) {
		
		String username = user.getUserName();
		
		
		return repository.findByUsername( username);
		
		
	}
	@Override
	public Object signIn(UserLogin inputs) {
		String username= inputs.getUserName();
		User user =repository.findByUsernameIgnoreCase(username).orElseThrow( () -> new NoSuchElementException());
		return user;
	}

	
}

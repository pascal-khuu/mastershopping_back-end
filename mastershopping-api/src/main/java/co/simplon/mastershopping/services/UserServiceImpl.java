package co.simplon.mastershopping.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import co.simplon.mastershopping.dtos.UserLogin;
import co.simplon.mastershopping.entities.User;
import co.simplon.mastershopping.repositories.UserRepository;


@Service
public class UserServiceImpl implements UserService {
	private final UserRepository repository;
	
	private final PasswordEncoder encoder;
	
	public UserServiceImpl (UserRepository repository, PasswordEncoder encoder) {
		this.repository=repository;
		this.encoder = encoder;
	}
	 public void create (UserLogin inputs){
	 User user = new User();
	 user.setUsername(inputs.getUsername());
	 String encoded = encoder.encode(inputs.getPassword());
	 user.setPassword(encoded);
	repository.save(user);
	}
	
	@Override
	public Object signIn(UserLogin inputs) {
		String username= inputs.getUsername();
		User user =repository.findByUsernameIgnoreCase(username).orElseThrow( () -> new BadCredentialsException(username));
		String password = inputs.getPassword();
		if (!encoder.matches(password, user.getPassword())) {
			throw new BadCredentialsException(username);
		}
		return user;
	}

	
}

package co.simplon.mastershopping.services;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.mastershopping.dtos.User;
import co.simplon.mastershopping.dtos.UserLogin;
import co.simplon.mastershopping.repositories.UserRepository;


@Service
public class UserServiceImpl implements UserService {
	private final UserRepository repository;
	
	public UserServiceImpl (UserRepository repository) {
		this.repository=repository;
	}
	@Override
	public void userLogin(UserLogin user) {
		
		
	}

	@Override
	public List<User> getUsersUserNameAndPassword() {
		
		return repository.findAllProjectedBy(User.class);
	}

}

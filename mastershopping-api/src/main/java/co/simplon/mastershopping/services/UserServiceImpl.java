package co.simplon.mastershopping.services;

import java.util.List;

import org.springframework.stereotype.Service;

import co.simplon.mastershopping.dtos.UserDto;
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
	public void userLogin(UserLogin user) {
		User entity =new User();
		
		
	}

	@Override
	public List<UserDto> getUsersUserNameAndPassword() {
		
		return repository.findAllProjectedBy(UserDto.class);
	}

}

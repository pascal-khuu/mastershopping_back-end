package co.simplon.mastershopping.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import co.simplon.mastershopping.dtos.UserLogin;
import co.simplon.mastershopping.entities.Role;
import co.simplon.mastershopping.entities.User;
import co.simplon.mastershopping.repositories.UserRepository;
import co.simplon.mastershopping.security.JwtProvider;

@Service
public class UserServiceImpl implements UserService {
	private final UserRepository repository;

	private final PasswordEncoder encoder;

	private final JwtProvider provider;

	public UserServiceImpl(UserRepository repository, PasswordEncoder encoder, JwtProvider provider) {
		this.repository = repository;
		this.encoder = encoder;
		this.provider = provider;
	}

	public void create(UserLogin inputs) {
		User user = new User();
		user.setUsername(inputs.getUsername());
		String encoded = encoder.encode(inputs.getPassword());
		user.setPassword(encoded);
		repository.save(user);
	}

	@Override
	public Object signIn(UserLogin inputs) {
		String username = inputs.getUsername();
		User user = repository.findByUsernameIgnoreCase(username)
				.orElseThrow(() -> new BadCredentialsException(username));
		String password = inputs.getPassword();
		if (!encoder.matches(password, user.getPassword())) {
			throw new BadCredentialsException(username);
		}
		Role role = user.getRole();
		List<String> roles = null;
		if (role != null) {
			roles = List.of(role.getRoleName());
		}
		return provider.create(String.valueOf(user.getId()), roles);
	}

}

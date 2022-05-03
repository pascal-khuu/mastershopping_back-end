package co.simplon.mastershopping.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UserLogin {

	@NotNull
	@NotBlank
	private String userName;
	
	@NotNull
	@NotBlank
	private String password;
	
	
}

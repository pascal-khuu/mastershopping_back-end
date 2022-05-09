package co.simplon.mastershopping.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UserLogin {

	@NotNull
	@NotBlank
	private String username;
	
	@NotNull
	@NotBlank
	private String password;
	
	public UserLogin() {
		
	}

	

	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserLogin [userName=" + username + ", password=" + password + "]";
	}
	
	
	
	
}

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
	
	public UserLogin() {
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserLogin [userName=" + userName + ", password=" + password + "]";
	}
	
	
	
	
}

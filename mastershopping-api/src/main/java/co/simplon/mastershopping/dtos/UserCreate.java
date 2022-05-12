package co.simplon.mastershopping.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UserCreate {

	@NotNull
	@NotBlank
	private String username;

	@NotNull
	@NotBlank
	private String password;

	@NotNull
	@NotBlank
	private String firstName;

	@NotNull
	@NotBlank
	private String lastName;

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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "UserCreate [username=" + username + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + "]";
	}

}

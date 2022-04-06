package com.appdeveloperblog.app.ws.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

public class UserDetailsRequestModel {
	 @NotNull(message = "stringValue has to be present")
	 @Email
	private String email;
	@NonNull
	@Size(min=8,max=16,message="password must be greater then 8 and less then 16")
	private String password;
	@NonNull
	private String firstName;
	@NonNull
	private String lastName;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

}

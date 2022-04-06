package com.appdeveloperblog.app.ws.ui.model.request;

import org.springframework.lang.NonNull;

public class UpdateUserDetailsRequestModel {
	@NonNull
	private String firstName;
	@NonNull
	private String lastName;
	
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

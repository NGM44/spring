package com.appdeveloperblog.app.ws.userservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.appdeveloperblog.app.ws.shared.Utils;
import com.appdeveloperblog.app.ws.ui.model.request.UpdateUserDetailsRequestModel;
import com.appdeveloperblog.app.ws.ui.model.request.UserDetailsRequestModel;
import com.appdeveloperblog.app.ws.ui.model.response.UserRest;

@Service
public class UserServiceImpl implements UserService {
	Map<String,UserRest> users;
	Utils utils;
	
	public UserServiceImpl() {
		
	}
	
	@Autowired
	public UserServiceImpl(Utils utils) {
		this.utils=utils;
	}
	
	@Override
	public UserRest createUser(UserDetailsRequestModel details) {
		UserRest returnValue=new UserRest();
		returnValue.setFirstName(details.getFirstName());
		returnValue.setLastName(details.getLastName());
		returnValue.setEmail(details.getEmail());
		String uuid= utils.generateUUID();
		returnValue.setUserId(uuid);
		
		if(users==null) users =new HashMap<>();
		users.put(uuid,returnValue);
		return returnValue;
	
	}
	
	public UserRest getUser(String userId) {
			return users.get(userId); 
	}
	
	
	public UserRest updateUser(String userId,UpdateUserDetailsRequestModel details) {
		UserRest storedUserDetail=users.get(userId);
		storedUserDetail.setFirstName(details.getFirstName());
		storedUserDetail.setLastName(details.getLastName());
		users.put(userId, storedUserDetail);
		return storedUserDetail;
	}
	
	public void deleteUser(String id) {
		users.remove(id);
	}
	

}

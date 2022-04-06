package com.appdeveloperblog.app.ws.userservice;

import com.appdeveloperblog.app.ws.ui.model.request.UpdateUserDetailsRequestModel;
import com.appdeveloperblog.app.ws.ui.model.request.UserDetailsRequestModel;
import com.appdeveloperblog.app.ws.ui.model.response.UserRest;

public interface UserService {
	UserRest createUser(UserDetailsRequestModel userDetails);
	UserRest getUser(String userId);
	UserRest updateUser(String userId,UpdateUserDetailsRequestModel details);
	 void deleteUser(String id);
}

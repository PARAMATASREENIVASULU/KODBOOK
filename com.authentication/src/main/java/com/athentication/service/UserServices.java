package com.athentication.service;

import com.athentication.entities.User;

public interface UserServices {

	boolean usernameExists(String username);
	void addUser(User user);
	boolean validateUser(String username, String password);
}



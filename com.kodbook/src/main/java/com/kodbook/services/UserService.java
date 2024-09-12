package com.kodbook.services;

import com.kodbook.entities.User;

public interface UserService {

	boolean userExists1(String username, String email);

	void addUser(User user);
	
	boolean validateUser(String username, String password);

	boolean resetPassword(String username, String password);

	void setpassword(String Username, String password);

}

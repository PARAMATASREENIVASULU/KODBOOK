package com.kodbook.services;

import com.kodbook.entities.User;

public interface UserService {

	boolean userExists(String username, String email);

	void addUser(User user);
	
	boolean validateUser(String username, String password);
/*
	void updatepassword(String password);

	boolean resetPassword(String username, String password);*/
}

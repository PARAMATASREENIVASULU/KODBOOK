package com.kodbook1.service;

import com.kodbook1.entities.User;

public interface UserService {

	void addUser(User user);

	boolean userExists(String username, String email);

	boolean validateUser(String username, String password);

	User getUser(String username);

	void updateUser(User user);

}

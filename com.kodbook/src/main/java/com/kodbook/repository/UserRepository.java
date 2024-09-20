package com.kodbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodbook.entities.User;

public interface UserRepository 
			extends JpaRepository<User, Long>{

	User findByUsername(String username);

	User findByEmail(String email);
/*
	User findByPassword(String password);

	boolean updatePassword(String password);

	User getusername();

	void updateuser(User user);

	*/

}
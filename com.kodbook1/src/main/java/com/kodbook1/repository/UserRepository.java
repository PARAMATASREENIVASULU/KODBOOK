package com.kodbook1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodbook1.entities.User;

public interface UserRepository 
				extends JpaRepository<User, Long>{


	User findByUsername(String username);

	User findByEmail(String email);

	User findByPassword(String password);

	
}

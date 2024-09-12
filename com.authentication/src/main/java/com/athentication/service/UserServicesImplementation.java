package com.athentication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.athentication.entities.User;
import com.athentication.repository.UserRepository;

@Service
public class UserServicesImplementation 
					implements UserServices{
	@Autowired
	UserRepository repo;

	
	public boolean usernameExists(String username) {
		User user = repo.findByUsername(username);
		
		if(user!=null) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public void addUser(User user) {
		repo.save(user);
		
	}


	@Override
	public boolean validateUser(String username, String password) {
		if(usernameExists(username)) {
			User user = repo.findByUsername(username);
			String dbpass = user.getPassword();
			if(password.equals(dbpass))
			{
				return true;
			
			}
		}
		return false;
	}

}

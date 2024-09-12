package com.kodbook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodbook.entities.User;
import com.kodbook.repository.UserRepository;

@Service
public class UserServiceImplementation 
					implements UserService{
	@Autowired
	UserRepository repo;
	
	public boolean userExists1(String username, String email) {
		User user1 = repo.findByUsername(username);
		User user2 = repo.findByEmail(email);
		if(user1!=null||user2!=null)
		{
			return true;
			
		}else {
		return false;
		}
	}


	public void addUser(User user) {
		repo.save(user);
	}


	


	@Override
	public boolean validateUser(String username, String password) {
		String dbpass = repo.findByUsername(username).getPassword();
		if(password.equals(dbpass))
		{
			return true;
		}else {
			return false;
		}
	}


	@Override
	public boolean resetPassword(String username, String password) {
		String dbpass=repo.findByUsername(username).getPassword();
		if(password.equals(dbpass)) {
			return true;
		}
		
		return false;
	}


	@Override
	public void setpassword(String Username, String password) {
		// TODO Auto-generated method stub
		
	}

	
}

package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.model.User;
import com.user.userrepository.UserRepository;

@Service
public class UserService {
	UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public String saveUser(User user) {
		String name=userRepository.save(user).getName();
		return name;
		
	}

	public List<User> getUserdetaillsbyname(String name) {
		List<User> user=userRepository.findByName(name);
		return user;
	}
	
	
	
	
}

package com.user.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.User;
import com.user.service.UserService;

@RestController
public class UserController {
	
	UserService userService;
	public UserController(UserService userService) {
		this.userService=userService;
	}
	
	@RequestMapping("/hello")
	public String Hello() {
		return "hello user world";
		
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.ACCEPTED)
    public String saveUserDetails(@RequestBody User user){
		String name=userService.saveUser(user);
		return name;
	}
	@RequestMapping(value="/user/{name}",method=RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public List<User> getUserDetails(@PathVariable("name") String name) {
		List<User> user=userService.getUserdetaillsbyname(name);
		return user;
		
	}
}

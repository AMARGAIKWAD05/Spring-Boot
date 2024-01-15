package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.User;
import com.example.Service.UserService;
@RestController
public class UserController {
	
	@Autowired
	UserService userService;

	/*
	  @PostMapping("/users")
	public User addUser(@RequestBody User user){
	
		return user;
		
	}
	
	@PostMapping("/users{10}")
	public int addUser1(@PathVariable int id){
	
		return id;
		
	}
	*/
	
	@PostMapping("/users")
	public User addUser(@RequestBody User user){
	
		return userService.addNewUser(user);
		
	}

}

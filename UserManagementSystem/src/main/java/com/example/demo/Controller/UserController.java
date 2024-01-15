package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.User;
import com.example.demo.Service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userservice;
	
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return userservice.addUser(user);
		
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userservice.getAllUsers();
	}
	
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable int id) {
		return userservice.getUserById(id);
		
	}
	
	@DeleteMapping("/users/{id}")
	public String deleteUser(@PathVariable int id) {
		return userservice.deleteUser(id);
		
	}
	@PutMapping("/users")
	public User updateUser(@RequestBody User user) {
		return userservice.updateUser(user);
	}
	

}

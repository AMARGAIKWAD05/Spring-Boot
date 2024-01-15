package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.User;

public interface UserService {
	
	public User addUser(User u);
	public List<User> getAllUsers();
	public User getUserById(int id);
	public String deleteUser(int id);
	public User updateUser(User u);
	

}

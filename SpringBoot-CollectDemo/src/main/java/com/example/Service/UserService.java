package com.example.Service;

import java.util.ArrayList;
import java.util.List;

import com.example.Entity.User;

public class UserService {

	
	public static int count=5;
	public static List<User> users=new ArrayList<>();
	
	static {
		users.add(new User(1,"Amar"));
		users.add(new User(2,"Pratik"));
		users.add(new User(3,"Ram"));
		users.add(new User(4,"sham"));
		users.add(new User(5,"Aniket"));
	}
	
	public User addNewUser(User user) {
		
		user.setId(++count);
		users.add(user);
		return user;
	}
	
	public List<User> getUsers(){
		return users;
	}
	
}

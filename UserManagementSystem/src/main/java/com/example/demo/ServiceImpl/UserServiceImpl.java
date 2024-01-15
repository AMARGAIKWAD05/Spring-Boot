package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepositer;
	
	@Override
	public User addUser(User u) {
		// TODO Auto-generated method stub
		return userRepositer.save(u);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepositer.findAll();
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userRepositer.findById(id).get();
	}

	@Override
	public String deleteUser(int id) {
		// TODO Auto-generated method stub
		userRepositer.deleteById(id);
		return "User is deleted";
	}

	@Override
	public User updateUser(User u) {
		// TODO Auto-generated method stub
		User use=userRepositer.findById(u.getUserId()).get();
		use.setUserName(u.getUserName());
		use.setEmail(u.getEmail());
		return userRepositer.save(use);
	}
	
	

}

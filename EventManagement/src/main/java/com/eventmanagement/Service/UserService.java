package com.eventmanagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventmanagement.Entity.User;
import com.eventmanagement.Repository.UserRepository;

import java.util.List;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	String error = "User not found";
	public User getUserById(int userId) {
		return userRepository.findById(userId).orElse(null);
		
	}
	
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
	public String updateUser(int userId, User user) {
		if (userRepository.existsById(userId)) {
			user.setId(userId); // Ensure the user ID is set
			userRepository.save(user);
			return "User " + userId +" updated successfully";
		} else {
			return "User id not found, please provide a correct id to update";
		}
	}
	
	public String deleteUser(int userId) {
		if (userRepository.existsById(userId)) {
			userRepository.deleteById(userId);
			return "User " + userId +" deleted successfully";
		} else {
			return "User id not found, please provide a correct id to delete";
		}
	}
	
	public User getUserByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}
}



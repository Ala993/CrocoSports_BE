package com.project.sport.services;

import com.project.sport.models.User;

public interface UserService {
	
	public User add(User user);
	
	public User getUserByEmailAndPassword(String email, String password);


}

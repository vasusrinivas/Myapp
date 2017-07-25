package com.myapp.springboot.service;

import com.myapp.springboot.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}

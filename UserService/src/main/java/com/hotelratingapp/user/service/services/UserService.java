package com.hotelratingapp.user.service.services;

import java.util.List;

import com.hotelratingapp.user.service.entities.User;

public interface UserService {
	
	User saveUser(User user);
	
	List<User> getAllUser();
	
	User getUser(String userId);
}

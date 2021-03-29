package com.sam.microserviceexample.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sam.microserviceexample.model.User;

@Component
public class UserDAOService {

	private static List<User> users = new ArrayList<>();
	
	private static int usersCount = 2;
	
	static {
		users.add(new User(1, "Ram", new Date()));
		users.add(new User(2, "Sam", new Date()));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User save(User user){
		if(user.getId() == null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		for(User user: users) {
			if(user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
}

package com.sam.microserviceexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sam.microserviceexample.model.User;
import com.sam.microserviceexample.service.UserDAOService;

@RestController
public class UserResource {

	@Autowired
	private UserDAOService userService;
	
	//retriveAllUsers
	@GetMapping("/users")
	public List<User> retriveAllUsers(){
		return userService.findAll();
	}
	//retriveUser(int id)
	
}

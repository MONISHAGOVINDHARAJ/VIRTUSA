package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.User;
import com.example.demo.service.ServiceClass;

@RestController
public class Controller {
	
	
	@Autowired
	ServiceClass serviceClass;
	
	@PostMapping("/add")
	public String addUser(@RequestBody User user) {
		serviceClass.save(user);
		return "successfully created";
	}
}

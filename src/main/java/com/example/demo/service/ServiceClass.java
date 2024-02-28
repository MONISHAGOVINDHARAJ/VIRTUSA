package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.User;
import com.example.demo.repo.Repo;

@Service
public class ServiceClass {

	@Autowired
	Repo repo;
	
	
	public String save(User user) {
		repo.save(user);
		return "successfully created";
	}
	
}

package com.blogger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogger.entity.User;
import com.blogger.manager.ManagerClass;

@Service
public class ServiceClass {

	@Autowired
	private ManagerClass manager;
	
	public void create(User user) {
		manager.create(user);
		
	}
	
}

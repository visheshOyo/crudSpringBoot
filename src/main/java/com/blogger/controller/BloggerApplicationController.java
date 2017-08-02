package com.blogger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blogger.entity.User;
import com.blogger.request.SignUpRequest;
import com.blogger.service.ServiceClass;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/signup")
public class BloggerApplicationController {
	
	@Autowired
	private ServiceClass service;  
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	/*public String create(@RequestParam("username") String username,
						@RequestParam("password") String password, 
						@RequestParam("email") String email) {
	service.create(new User(username,password,email));
		return "Done";
	}
	*/
	public String create(@RequestBody SignUpRequest request) {
		User user = requestToEntity(request);
		service.create(user);
		return "done";
	}
	
	private User requestToEntity(SignUpRequest request) {
		User user = new User();
		user.setName(request.getUsername());
		user.setEmail(request.getEmail());
		user.setPassword(request.getPassword());
		return user;
	}
}

package com.blogger.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.blogger.entity.User;
import com.blogger.repo.RepoUser;

@Component
public class ManagerClass {

	@Autowired
	private RepoUser repo;
	private final String salt = "encryptmypass"; 
	public void create(User user) {
		User u = repo.findByUsername(user.getName());
		if(u != null) {}
		else{
			String password = user.getPassword();
			password += salt;
			user.setPassword(password);
			repo.save(user);
		}
	}
	public String login(User user) {
		User u  = repo.findByUsername(user.getName());
		String password = user.getPassword() + salt;
		if(password.equals(u.getPassword())) {
			return "Welcome" + u.getName();
		}
		else {
			return "wrong username or password";
		}
	}

}

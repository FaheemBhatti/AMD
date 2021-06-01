package org.codechamps.controller;

import java.util.List;

import org.codechamps.model.User;
import org.codechamps.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
@RequestMapping(value = "/api/v1")
public class Controller {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/user" , 
			method = RequestMethod.GET )
	public List<User> getUser() {
		return userService.getUser();
	}
}

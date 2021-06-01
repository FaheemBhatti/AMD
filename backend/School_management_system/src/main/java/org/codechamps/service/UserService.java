package org.codechamps.service;

import java.util.List;

import org.codechamps.model.User;
import org.codechamps.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepo repo;

	public List<User> getUser() {
		return (List<User>) repo.findAll();
	}
}

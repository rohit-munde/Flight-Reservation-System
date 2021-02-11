package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.UserRepository;
import com.app.pojos.User;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository repo;
	@Override
	public User authenticateUser(String email, String password) {
//		User u = new User(email, password);
//		int id = u.getUserId();
//		repo.findById(id);
		User validUser = repo.findByEmailAndPassword(email,password);
		return  validUser; //it will return u if user is valid else return null
	}

}

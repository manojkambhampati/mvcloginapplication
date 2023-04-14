package com.mvc.examples.mvcapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.examples.mvcapplication.dao.UserDao;
import com.mvc.examples.mvcapplication.model.Fisuser;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao dao;

	@Override
	public String addUser(Fisuser user) {
		// TODO Auto-generated method stub
		return dao.addUser(user);
	}

	@Override
	public String deleteUser(String user) {
		// TODO Auto-generated method stub
		return dao.deleteUser(user);
	}

	@Override
	public Fisuser searchUser(String username) {
		// TODO Auto-generated method stub
		return dao.searchUser(username);
	}

	@Override
	public List<Fisuser> getAllusers() {
		// TODO Auto-generated method stub
		return dao.getAllusers();
	}

}

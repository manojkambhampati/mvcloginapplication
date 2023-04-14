package com.mvc.examples.mvcapplication.dao;
import java.util.List;

import com.mvc.examples.mvcapplication.model.Fisuser;
public interface UserDao {
	public String addUser(Fisuser user);
	public String deleteUser(String user);
	public Fisuser searchUser(String username);
	public List<Fisuser> getAllusers();
}

package com.mvc.examples.mvcapplication.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mvc.examples.mvcapplication.model.Fisuser;
import com.mvc.examples.mvcapplication.model.FisuserRowMapper;
@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	JdbcTemplate template;

	@Override
	public String addUser(Fisuser user) {
		// TODO Auto-generated method stub
		String sql = "insert into fisuser values(?,?)";
		template.update(sql,user.getName(),user.getPassword());
		return "added";
	}

	@Override
	public String deleteUser(String user) {
		// TODO Auto-generated method stub
		String sql="delete from fisuser where name=?";
		template.update(sql,user);
		return "User has been deleted";
	}

	@Override
	public Fisuser searchUser(String username) {
		// TODO Auto-generated method stub
		String sql = "select * from fisuser";
		List<Fisuser> users = template.query(sql, new FisuserRowMapper());
		Fisuser temp = null;
		for(Fisuser usr:users) {
			if(username.equals(usr.getName())) {
				temp=usr;
				break;
			}
		}
		return temp;	
	}

	@Override
	public List<Fisuser> getAllusers() {
		// TODO Auto-generated method stub
		String sql="select * from fisuser";
		List<Fisuser> users = template.query(sql, new FisuserRowMapper());
		return users;
	}

}

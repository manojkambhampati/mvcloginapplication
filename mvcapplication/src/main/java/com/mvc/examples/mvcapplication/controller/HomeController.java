package com.mvc.examples.mvcapplication.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.examples.mvcapplication.model.Fisuser;
import com.mvc.examples.mvcapplication.model.Students;
import com.mvc.examples.mvcapplication.service.UserService;

@Controller
public class HomeController {

	@Autowired
	UserService service;

	@RequestMapping(value = "/test2")
	public ModelAndView test2() {

		ArrayList<Students> data = new ArrayList<>();
		data.add(new Students(1, "praveen"));
		data.add(new Students(2, "kumar"));
		data.add(new Students(3, "sunil"));

		return new ModelAndView("test2", "data", data);
	}

	@RequestMapping(value = "/")
	public ModelAndView test(HttpServletResponse response) throws IOException {
		return new ModelAndView("home");
	}

	@RequestMapping("/add")
	public String addData() {
		return "add";
	}

	@RequestMapping(value = "/register")
	public ModelAndView register(HttpServletRequest request) throws IOException {
		String uname = request.getParameter("lid");
		String passwd = request.getParameter("pwd");
		Fisuser user = new Fisuser(uname, passwd);
		service.addUser(user);

		return new ModelAndView("success");
	}

	@RequestMapping("/delete")
	public ModelAndView deleteData(HttpServletRequest request) {
		String name=request.getParameter("deluser");
		service.deleteUser(name);
		return new ModelAndView("success");
	}

	@RequestMapping("/search")
	public String searchData() {
		return "search";
	}

	@RequestMapping("/searchuser")
	public ModelAndView searchuser(HttpServletRequest request) {
		String uname = request.getParameter("lid");
		Fisuser user = service.searchUser(uname);
		return new ModelAndView("displayuser","user",user);
	}

	@RequestMapping(value = "/success")
	public ModelAndView test1(HttpServletRequest request) throws IOException {
		String uname = request.getParameter("lid");
		String passwd = request.getParameter("pwd");
		List<Fisuser> users = service.getAllusers();

		boolean found = false;
		for (Fisuser usr : users) {
			if (uname.equals(usr.getName()) && passwd.equals(usr.getPassword())) {
				found = true;
				break;
			}
		}

		if (found)

			return new ModelAndView("success", "user", uname);
		else
			return new ModelAndView("fail");
	}
}
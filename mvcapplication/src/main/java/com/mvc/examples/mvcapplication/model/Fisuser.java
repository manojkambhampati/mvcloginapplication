package com.mvc.examples.mvcapplication.model;

public class Fisuser {
	String name;
	String password;
	public Fisuser() {
		// TODO Auto-generated constructor stub
	}
	public Fisuser(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

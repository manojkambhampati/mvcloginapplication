package com.mvc.examples.mvcapplication.model;

public class Students {
	int id;
	String name;
	public Students() {
		// TODO Auto-generated constructor stub
	}
	public Students(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

package com.cbt.bean;

public class User {
	private String name;
	public User(){
		System.out.println("User的无参构造方法执行");
	}
	public void setName(String name) {
		this.name = name;
	}
	public void show(){
		System.out.println("name:"+name);
	}
}

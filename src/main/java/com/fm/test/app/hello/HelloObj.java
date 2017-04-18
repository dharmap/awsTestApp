package com.fm.test.app.hello;

public class HelloObj {
	private String name;
	private String message;
	
	private HelloObj(){}
	
	public HelloObj(String name, String message){
		this.name = name;
		this.message = message;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}

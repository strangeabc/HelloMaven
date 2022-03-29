package com.maven;

public class HelloFriend {
	public String sayHelloToFriend(String name){
		return "Hello " + name + "! I am " + this.getMyName();
	}
	public String getMyName(){
		return "John";
	}
}
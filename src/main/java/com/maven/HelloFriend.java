package com.maven;

public class HelloFriend {
	public String sayHelloToFriend(String name){
		System.out.println("hot fix...");
		return "Hello " + name + "! I am " + this.getMyName();
	}
	public String getMyName(){
		return "John";
	}
}
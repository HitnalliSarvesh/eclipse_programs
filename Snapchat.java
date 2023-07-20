package com.xworkz.inheritance.things;

public class Snapchat extends Application{
	public String userName;
	public String password;
	public int numOfFilters;
	
	public Snapchat() {
		System.out.println("Snapchat no-argument constructor");
	}

	public Snapchat(String userName, String password, int numOfFilters) {
		this.userName = userName;
		this.password = password;
		this.numOfFilters = numOfFilters;
		System.out.println("Snapchat all-argument constructor");
	}
	
	public void videoCall() {
		System.out.println("Snapchat Video call method");
	}
	
	

}

package com.xworkz.inheritance.things;

public class Instagram extends Application{
	public String userName;
	public String password;
	public int followers;
	
	public Instagram() {
		System.out.println("Instagram no-argument constructor");
	}

	public Instagram(String userName, String password, int followers) {
		this.userName = userName;
		this.password = password;
		this.followers = followers;
		System.out.println("Instagram all-argument constructor");
	}
	
	public void chat() {
		System.out.println("Insta chat method");
	}
	
	
	

}

package com.xworkz.inheritance.things;

public class Whatsapp extends Application{
	public String phoneNumber;
	public int groups;
	public int chats;
	
	public Whatsapp() {
		System.out.println("Whatsapp no-argument construtor");
	}

	public Whatsapp(String phoneNumber, int groups, int chats) {
		this.phoneNumber = phoneNumber;
		this.groups = groups;
		this.chats = chats;
		System.out.println("Whatsapp all-argument constructor");
	}
	
	public void voiceCall() {
		System.out.println("Whatsapp voice call method ");
	}
	
	

}

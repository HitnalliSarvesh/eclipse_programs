package com.xworkz.constructor.things;

public class Telegram {
	public String migratephoneNumber;
	public String uploadProfilePictures;
	public String jobsApplication;
	public String telegramBots;
	public String nightMode;
	public String muteContacts;
	public String createGroups;
	public String liveLocation;
	public String privacy;
	public String security;
	
	public Telegram() {
		System.out.println("No-Argument constructor");
	}
	
	public Telegram(String migratephoneNumber,String uploadProfilePictures,String jobsApplication,String telegramBots,String nightMode,
			String muteContacts,String createGroups,String liveLocation,String privacy,String security) {
		System.out.println("All-argument constructor");
		this.migratephoneNumber=migratephoneNumber;
		this.uploadProfilePictures=uploadProfilePictures;
		this.jobsApplication=jobsApplication;
		this.telegramBots=telegramBots;
		this.nightMode=nightMode;
		this.muteContacts=muteContacts;
		this.createGroups=createGroups;
		this.liveLocation=liveLocation;
		this.privacy=privacy;
		this.security=security;
	}
	
	public void chat() {
		System.out.println("Chat method");
	}
	public void download() {
		System.out.println("Download method");
	}
	public void upload() {
		System.out.println("Upload method");
	}
	public void customize() {
		System.out.println("Customize method");
	}
	public void delete() {
		System.out.println("Delete method");
	}

	
}

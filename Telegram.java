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
	
	public void setMigratephoneNumber(String migratephoneNumber) {          
		this.migratephoneNumber=migratephoneNumber;
	}
	public String getMigratephoneNumber() {
		return migratephoneNumber;
	}
	public void setUploadProfilePictures(String uploadProfilePictures) {          
		this.uploadProfilePictures=uploadProfilePictures;
	}
	public String getUploadProfilePictures() {
		return uploadProfilePictures;
	}
	public void setJobsApplication(String jobsApplication) {          
		this.jobsApplication=jobsApplication;
	}
	public String getJobsApplication() {
		return jobsApplication;
	}
	public void setTelegramBots(String telegramBots) {          
		this.telegramBots=telegramBots;
	}
	public String getTelegramBots() {
		return telegramBots;
	}
	public void setNightMode(String nightMode) {          
		this.nightMode=nightMode;
	}
	public String getNightMode() {
		return nightMode;
	}
	public void setMuteContacts(String muteContacts) {          
		this.muteContacts=muteContacts;
	}
	public String getMuteContacts() {
		return muteContacts;
	}
	public void setCreateGroups(String createGroups) {          
		this.createGroups=createGroups;
	}
	public String getCreateGroups() {
		return createGroups;
	}
	public void setLiveLocation(String liveLocation ) {          
		this.liveLocation=liveLocation;
	}
	public String getLiveLocation() {
		return liveLocation;
	}
	public void setPrivacy(String privacy) {          
		this.privacy=privacy;
	}
	public String getPrivacy() {
		return privacy;
	}
	public void setSecurity(String security) {          
		this.security=security;
	}
	public String getSecurity() {
		return security;
	}

}

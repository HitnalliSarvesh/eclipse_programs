package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Telegram;

public class TelegramRunner {
	public static void main(String args[]) {
		Telegram telegram=new Telegram();
		telegram.setMigratephoneNumber("9988764521");
		telegram.setUploadProfilePictures("Profile picture");
		telegram.setJobsApplication("Jobs Portal");
		telegram.setTelegramBots("AI Bots");
		telegram.setNightMode("Dark Mode");
		telegram.setMuteContacts("Mute Unnecessary contacts");
		telegram.setCreateGroups("Create Groups");
		telegram.setLiveLocation("Live location");
		telegram.setPrivacy("Privacy encryption");
		telegram.setSecurity("Security");
		System.out.println(telegram.getMigratephoneNumber());
		System.out.println(telegram.getUploadProfilePictures());
		System.out.println(telegram.getJobsApplication());
		System.out.println(telegram.getTelegramBots());
		System.out.println(telegram.getNightMode());
		System.out.println(telegram.getMuteContacts());
		System.out.println(telegram.getCreateGroups());
		System.out.println(telegram.getLiveLocation());
		System.out.println(telegram.getPrivacy());
		System.out.println(telegram.getSecurity());
	}

}

package com.xworkz.finalkeyword;

public class GoogleScholar extends Google{
	public String founder;
	public String metaDataQuality;
	public int noOfWebsites;
	public int noOfResults;
	public long noOfLiterature;
	
	public GoogleScholar() {
		System.out.println("No-argument constructor for Google Scholar");
	}
	
	
	public GoogleScholar(String founder, String metaDataQuality, int noOfWebsites, int noOfResults,
			long noOfLiterature) {
		System.out.println("All-argument constructor for Google Scholar");
		this.founder = founder;
		this.metaDataQuality = metaDataQuality;
		this.noOfWebsites = noOfWebsites;
		this.noOfResults = noOfResults;
		this.noOfLiterature = noOfLiterature;
	}


	@Override
	public void googleChrome() {
		System.out.println("This is Google chrome method in Google Scholar class");
	}
	@Override
	public void googleMaps() {
		System.out.println("This is Google Maps method in Google Scholar class");
	}
	@Override
	public void googleDrive() {
		System.out.println("This is Google Drive method in Google Scholar class");
	}
	@Override
	public void googlePhotos() {
		System.out.println("This is Google Photos method in Google Scholar class");
	}
	@Override
	public void gmail() {
		System.out.println("This is Gmail method in Google Scholar class");
	}
	@Override
	public void googleCalender() {
		System.out.println("This is Google Calender method in Google Scholar class");
	}
	@Override
	public void googleDocs() {
		System.out.println("This is Google Docs method in Google Scholar class");
	}
	@Override
	public void googleSheets() {
		System.out.println("This is Google Sheets method in Google Scholar class");
	}
	@Override
	public void googleSlides() {
		System.out.println("This is Google Slides method in Google Scholar class");
	}
	@Override
	public void googleKeep() {
		System.out.println("This is Google Keep method in Google Scholar class");
	}
	@Override
	public void googleTranslate() {
		System.out.println("This is Google Translate method in Google Scholar class");
	}
	@Override
	public void googleAssistant() {
		System.out.println("This is Google Assistant method in Google Scholar class");
	}
	@Override
	public void googlePay() {
		System.out.println("This is Google Pay method in Google Scholar class");
	}
	@Override
	public void googlePhotoscan() {
		System.out.println("This is Google PhotoScan method in Google Scholar class");
	}
	@Override
	public void googleDuo() {
		System.out.println("This is Google Duo method in Google Scholar class");
	}
	@Override
	public void googlePodcasts() {
		System.out.println("This is Google Podcasts method in Google Scholar class");
	}
	@Override
	public void googleFit() {
		System.out.println("This is Google Fit method in Google Scholar class");
	}
	@Override
	public void googleNews() {
		System.out.println("This is Google News method in Google Scholar class");
	}
	@Override
	public void googleAuthenticator() {
		System.out.println("This is Google Authenticator method in Google Scholar class");
	}
	@Override
	public void googleWeather() {
		System.out.println("This is Google Weather method in Google Scholar class");
	}


}

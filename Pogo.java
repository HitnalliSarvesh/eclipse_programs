package com.xworkz.constructor.things;

public class Pogo {
	private String type;
	private int numOfShows;
	private String animation;
	private String founder;
	private String durationOfEachShow;
	private int viewers;
	private int charge;
	private boolean service;
	private String subscribers;
	private String mode;
	
	public Pogo() {
		System.out.println("No-Argument constructor");
	}
	public void setType(String type) {          
		this.type=type;
	}
	public String getType() {
		return type;
	}
	public void setNumOfShows(int numOfShows ) {          
		this.numOfShows=numOfShows;
	}
	public int getNumOfShows() {
		return numOfShows;
	}
	public void setAnimation(String animation) {          
		this.animation=animation;
	}
	public String getAnimation() {
		return animation;
	}
	public void setFounder(String founder) {          
		this.founder=founder;
	}
	public String getFounder() {
		return founder;
	}
	public void setDurationOfEachShow(String durationOfEachShow) {          
		this.durationOfEachShow=durationOfEachShow;
	}
	public String getDurationOfEachShow() {
		return durationOfEachShow;
	}
	public void setViewers(int viewers) {          
		this.viewers=viewers;
	}
	public int getViewers() {
		return viewers;
	}
	public void setCharge(int charge) {          
		this.charge=charge;
	}
	public int getCharge() {
		return charge;
	}
	public void setService(boolean service) {          
		this.service=service;
	}
	public boolean getService() {
		return service;
	}
	public void setSubscribers(String subscribers) {          
		this.subscribers=subscribers;
	}
	public String getSubscribers() {
		return subscribers;
	}
	public void setMode(String mode) {          
		this.mode=mode;
	}
	public String getMode() {
		return mode;
	}
}
	
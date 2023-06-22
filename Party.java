package com.xworkz.constructor.things;

public class Party {
	private String type;
	private String dressCode;
	private int guests;
	private String food;
	private String beverages;
	private String decoration;
	private int tablesAndChairs; 
	private int budget;
	private String venue;
	private String activities;
	
	public Party() {
		System.out.println("No-Argument constructor");
	}
	public void setType(String type) {          
		this.type=type;
	}
	public String getType() {
		return type;
	}
	public void setDressCode(String dressCode) {          
		this.dressCode=dressCode;
	}
	public String getDressCode() {
		return dressCode;
	}
	public void setGuests(int guests) {          
		this.guests=guests;
	}
	public int getGuests() {
		return guests;
	}
	public void setFood(String food) {          
		this.food=food;
	}
	public String getFood() {
		return food;
	}
	public void setBeverages(String beverages) {          
		this.beverages=beverages;
	}
	public String getBeverages() {
		return beverages;
	}
	public void setDecoration(String decoration) {          
		this.decoration=decoration;
	}
	public String getDecoration() {
		return decoration;
	}
	public void setTablesAndChairs(int tablesAndChairs) {          
		this.tablesAndChairs=tablesAndChairs;
	}
	public int getTablesAndChairs() {
		return tablesAndChairs;
	}
	public void setBudget(int budget) {          
		this.budget=budget;
	}
	public int getBudget() {
		return budget;
	}
	public void setVenue(String venue) {          
		this.venue=venue;
	}
	public String getVenue() {
		return venue;
	}
	public void setActivities(String activities) {          
		this.activities=activities;
	}
	public String getActivities() {
		return activities;
	}
}
	

package com.xworkz.constructor.things;

public class Party {
	public String type;
	public String dressCode;
	public int guests;
	public String food;
	public String beverages;
	public String decoration;
	public int tablesAndChairs; 
	public int budget;
	public String venue;
	public String activities;
	
	public Party() {
		System.out.println("No-Argument constructor");
	}
	
	public Party(String type,String dressCode,int guests, String food, String beverages,
			String decoration,int tablesAndChairs,int budget,String venue,String activities) {
		System.out.println("All-argument constructor");
		this.type=type;
		this.dressCode=dressCode;
		this.guests=guests;
		this.food=food;
		this.beverages=beverages;
		this.decoration=decoration;
		this.tablesAndChairs=tablesAndChairs;
		this.budget=budget;
		this.venue=venue;
		this.activities=activities;
	}
	
	public void eat() {
		System.out.println("Eat method");
	}
	public void drink() {
		System.out.println("Drink method");
	}
	public void dance() {
		System.out.println("Dance method");
	}
	public void celebrate() {
		System.out.println("Celebrate method");
	}
	public void enjoy() {
		System.out.println("Enjoy method");
	}

}

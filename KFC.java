package com.xworkz.finalkeyword;

public class KFC {
	String founder;
	String foundedOn;
	String branchesInBnglr[] = {"Basavanagudi","Fraser Town","Malleshwaram","Jayanagar","Yeshwantpur"};
	String location;
	String shopOwnerName;
	int noOfWorkers;
	String shopOpeningTime;
	String shopClosingTime;
	boolean vegAvaialable;
	float rating;
	
    public KFC() {
    	System.out.println("No-Argument Constructor of KFC");
    }

	public KFC(String founder, String foundedOn, String[] branchesInBnglr, String location, String shopOwnerName,
			int noOfWorkers, String shopOpeningTime, String shopClosingTime, boolean vegAvaialable, float rating) {
		System.out.println("All argument constructor");
		this.founder = founder;
		this.foundedOn = foundedOn;
		this.branchesInBnglr = branchesInBnglr;
		this.location = location;
		this.shopOwnerName = shopOwnerName;
		this.noOfWorkers = noOfWorkers;
		this.shopOpeningTime = shopOpeningTime;
		this.shopClosingTime = shopClosingTime;
		this.vegAvaialable = vegAvaialable;
		this.rating = rating;
	}
	
	public void checkIn() {
		System.out.println("Check in method in KFC");
	}
	
	public void order() {
		System.out.println("order method inside KFC");
	}
	public void accept() {
		System.out.println("Accept method in KFC");
	}
	public void cook() {
		System.out.println("Cooking method in KFC");
	}
	public void serve() {
		System.out.println("Serve method in KFC");
	}
	public void eat() {
		System.out.println("Eat method in KFC");
	}
	public void drink() {
		System.out.println("Drink method in KFC");
	}
	public void handwash() {
		System.out.println("Hand wash method in KFC");
	}
	public void payment() {
		System.out.println("Payment method in KFC");
	}
	public void checkOut() {
		System.out.println("Check Out method in KFC");
	}
    
	

}

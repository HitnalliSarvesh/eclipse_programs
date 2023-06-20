package com.xworkz.constructor.things;

public class Makemytrip {
	public String hotels;
	public String flights;
	public String trains;
	public String holidayPackages;
	public String homeStays;
	public String travelInsurance;
	public String giftCards;
	public String airportCabs;
	public String tripIdeas;
	public String activities;
	
	
	public Makemytrip() {
		System.out.println("No-argument constructor");
	}
	
	public Makemytrip(String hotels,String flights,String trains,String holidayPackages,String homeStays,
			String travelInsurance,String giftCards,String airportCabs,String tripIdeas,String activities) {
		System.out.println("All-Argument constructor");
		this.hotels=hotels;
		this.flights=flights;
		this.trains=trains;
		this.holidayPackages=holidayPackages;
		this.homeStays=homeStays;
		this.travelInsurance=travelInsurance;
		this.giftCards=giftCards;
		this.airportCabs=airportCabs;
		this.tripIdeas=tripIdeas;
		this.activities=activities;
	}
	
	public void booking() {
		System.out.println("Booking method");
	}
	public void planning() {
		System.out.println("Planning method");
	}
	public void blog() {
		System.out.println("Blog method");
	}
	public void travel() {
		System.out.println("Travel method");
	}
	public void currencyExchange() {
		System.out.println("Currency Exchange method");
	}


}

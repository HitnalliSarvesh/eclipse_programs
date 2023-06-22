package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Makemytrip;

public class MakemytripRunner {
	public static void main(String args[]) {
		Makemytrip mmt = new Makemytrip();
		mmt.setHotels("ManveetPlaza");
		mmt.setFlights("AirIndia");
		mmt.setTrains("VandeBharath Express");
		mmt.setHolidayPackages("3 days 4 nights");
		mmt.setHomeStays("Golden Suite Home");
		mmt.setTravelInsurance("Insurance Loan");
		mmt.setGiftCards("Free Breakfast");
		mmt.setAirportCabs("Innova");
		mmt.setTripIdeas("Tripping");
		mmt.setActivities("Cycling and Yoga");
		System.out.println("Hotel: "+mmt.getHotels());
		System.out.println("Flight: "+mmt.getFlights());
		System.out.println("Train: "+mmt.getTrains());
		System.out.println("Holiday Package: "+mmt.getHolidayPackages());
		System.out.println("Homes: "+mmt.getHomeStays());
		System.out.println("Travel Insurance type: "+mmt.getTravelInsurance());
		System.out.println("Gift Card: "+mmt.getGiftCards());
		System.out.println("Airport Cab: "+mmt.getAirportCabs());
		System.out.println("Trip: "+mmt.getTripIdeas());
		System.out.println("Activities: "+mmt.getActivities());
		
	}

}

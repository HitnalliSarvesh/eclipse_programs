package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Party;

public class PartyRunner {
	public static void main(String args[]) {
		Party party=new Party();
		party.setType("Birthday Party");
		party.setDressCode("Yellow and Red");
		party.setGuests(150);
		party.setFood("Snacks and cake");
		party.setBeverages("Fruit Juice");
		party.setDecoration("Balloon Decoration");
		party.setTablesAndChairs(150);
		party.setBudget(10000);
		party.setVenue("Function Hall");
		party.setActivities("Singing and Dancing");
		System.out.println("Type of party:"+party.getType());
		System.out.println("Dress code:"+party.getDressCode());
		System.out.println("Number of Guests:"+party.getGuests());
		System.out.println("Type of food:"+party.getFood());
		System.out.println("Type of beverages:"+party.getBeverages());
		System.out.println("Decoration type:"+party.getDecoration());
		System.out.println("Number of tables and Chairs:"+party.getTablesAndChairs());
		System.out.println("Budget of party:"+party.getBudget());
		System.out.println("Venue of party:"+party.getVenue());
		System.out.println("Activities in the party:"+party.getActivities());
	}

}

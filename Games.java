package com.xworkz.inheritance.things;

public class Games {
	public String type;
	public int players;
	public String groundVenue;
	
	public Games() {
		System.out.println("Games no-argument constructor");
	}
	public Games(String type, int players, String grounVenue) {
		this.type=type;
		this.players=players;
		this.groundVenue=groundVenue;
		System.out.println("All-argument constructor");
	}
	public void playing() {
		System.out.println("This is a playing method");
	}
	
	public void display() {
		System.out.println("TYPE:"+this.type+" "+"Players:"+this.players+" "+"VENUE:"+this.groundVenue);
	}

}

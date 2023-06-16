package com.xworkz.constructor.things;

public class Snacks {
	public String name;
	public String type;
	public int price;
	public float rating;
	public String location;
	
	public Snacks() {
		System.out.println("This is default constructor");
	}
	public Snacks(String name,String type,int price,float rating,String location) {
		System.out.println("This is a parameterized constructor");
	
	this.name=name;
	this.type=type;
	this.price=price;
	this.rating=rating;
	this.location=location;
	}
	public void displaySnacks() {
		System.out.println("Name of the snacks:"+this.name);
		System.out.println("Type of snacks:"+this.type);
		System.out.println("Price of the snacks:"+this.price);
		System.out.println("Rating of the snacks:"+this.rating);
		System.out.println("Location:"+this.location);
		
		
	}

}

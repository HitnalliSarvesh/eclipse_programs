package com.xworkz.inheritance.things;

public class Hotel {
	public String type;
	public String name;
	public String location;
	
	public Hotel() {
		System.out.println("No-Argument Constructor");
	}
	
	public Hotel(String type, String name, String location) {
		this.type=type;
		this.name=name;
		this.location=location;
	}
	public void service() {
		System.out.println("this is service method");
	}
	
	public void display() {
		System.out.println("Type:"+this.type);
		System.out.println("Name:"+this.name);
		System.out.println("Location:"+this.location);
	}

}

package com.xworkz.inheritance.things;

public class Cricket extends Outdoor {
	public String capacity;
	
	public Cricket() {
		System.out.println("Cricket no-argument constructor");
	}
	public Cricket(String capacity) {
		this.capacity=capacity;
		System.out.println("Cricekt 1 argument constructor");
	}

}

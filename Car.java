package com.xworkz.constructor.things;

public class Car {
	public String name;
	public String type;
	public int price;
	public float torque;
	public int avg;
	
	public Car() {
		System.out.println("This is a default constructor");
	}
	
	public Car(String name,String type,int price,float torque,int avg) {
		System.out.println("This is a parameterized constructor");
		this.name=name;
		this.type=type;
		this.price=price;
		this.torque=torque;
		this.avg=avg;
	}
	
	public void displayCar() {
		System.out.println("Name of the car:"+this.name);
		System.out.println("Type of the work:"+this.type);
		System.out.println("Price of the car:"+this.price);
		System.out.println("Torque:"+this.torque);
		System.out.println("Average:"+this.avg);
	}

}

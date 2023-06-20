package com.xworkz.constructor.things;

public class Irctc {
	//Literal way of assigning values to the variables.
	public String name="Sarvesh";
	public int price=550;
	public String seatNumber="D12";
	public String location="Vijayapur";
	
	public Irctc()
	{
		System.out.println("No-Argument Construtor");
	}
	
	//Assigning values using constructor
	public Irctc(String name,int price, String seatNumber,String location){
		System.out.println("Argument Construtor");
		this.name=name;
		this.price=price;
		this.seatNumber=seatNumber;
		this.location=location;
	}
	
	//using setter method
	public void setName(String name) {
		this.name=name;
	}
	
	//using getter method
	public String getName() {
		return this.name;
	}
	
	
	
	

}

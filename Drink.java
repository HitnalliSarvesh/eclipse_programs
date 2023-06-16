package com.xworkz.constructor.things;

public class Drink {

	public String name;
	public int price;
	public String type;
	public boolean nonalcoholic;
	public float rating;
	
	public Drink() {
		System.out.println("This ia a default constructor");
	}
	public Drink(String name,int price,String type,boolean nonalcoholic,float rating) {
		System.out.println("This is a parameterized constructor");
		this.name=name;
		this.price=price;
		this.type=type;
		this.nonalcoholic=nonalcoholic;
		this.rating=rating;
	}
	public void displayStaff() {
		System.out.println("Name of the drink:"+this.name);
		System.out.println("Price of the drink:"+this.price);
		System.out.println("Type of the drink:"+this.type);
		System.out.println("Non-Alcoholic drink:"+this.nonalcoholic);
		System.out.println("Rating:"+this.rating);
	}
	
}

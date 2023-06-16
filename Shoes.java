package com.xworkz.constructor.things;

public class Shoes {
	public String company;
	public String type;
	public String colour;
	public boolean onlineshopping;
	public int price;
	
	public Shoes() {
		System.out.println("This is a default constructor");
	}
	public Shoes(String company,String type,String colour,boolean onlineshopping,int price) {
		System.out.println("This is a parameterized constructor");
		this.company=company;
		this.type=type;
		this.colour=colour;
		this.onlineshopping=onlineshopping;
		this.price=price;
	}
	public void displayStaff() {
		System.out.println("Shoes Company:"+this.company);
		System.out.println("Shoes type:"+this.type);
		System.out.println("Shoes colour:"+this.colour);
		System.out.println("Online Shopping:"+this.onlineshopping);
		System.out.println("Price:"+this.price);
	}

}

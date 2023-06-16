package com.xworkz.constructor.things;

public class Dress {
	public String type;
	public String brandName;
	public int size;
	public int price;
	public float rating;
	
	public Dress() {
		System.out.println("This is a no-argument constructor");
	}
	
	public Dress(String type,String brandName,int size,int price,float rating) {
		System.out.println("This is a parameterized constructor");
		this.type=type;
		this.brandName=brandName;
		this.size=size;
		this.price=price;
		this.rating=rating;
	}
	
	public void displayDress() {
		System.out.println("Dress type:"+this.type);
		System.out.println("Brand Name:"+this.brandName);
		System.out.println("Size of the dress in cms:"+this.size);
		System.out.println("Price of the dress:"+this.price);
		System.out.println("Rating:"+this.rating);
	}

}

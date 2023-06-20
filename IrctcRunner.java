package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Irctc;

public class IrctcRunner {
	public static void main(String args[]) {
		Irctc irctc=new Irctc();
		System.out.println("Name is:"+irctc.name);
		System.out.println("Price is:"+irctc.price);
		System.out.println("Seat Number:"+irctc.seatNumber);
		System.out.println("Location:"+irctc.location);
		
		//Printing values using constructor
		Irctc irctc1=new Irctc("Aishwarya",480,"Bellary","F23");
		System.out.println("Name is:"+irctc1.name);
		System.out.println("Price is:"+irctc1.price);
		System.out.println("Seat Number:"+irctc1.seatNumber);
		System.out.println("Location:"+irctc1.location);
		
		//Assigning values and printing values by using reference.
		Irctc irctc2= new Irctc();
		irctc2.name="Sagar";
		irctc2.price=580;
		irctc2.seatNumber="C12";
		irctc2.location="Dharwad";
		
		System.out.println("Name is:"+irctc2.name);
		System.out.println("Price is:"+irctc2.price);
		System.out.println("Seat Number:"+irctc2.seatNumber);
		System.out.println("Location:"+irctc2.location);
		
		//using setter method
		Irctc irctc3=new Irctc();
		irctc3.setName("Ravi");
		System.out.println("name is:"+irctc3.name);
		
		
	
	}

}

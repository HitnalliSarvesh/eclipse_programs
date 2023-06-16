package com.xworkz.constructor.things;

public class Bicycle {
	public String companyName[];
	public String type[];
	public int gears[];
	public int brakes;
	public int carrier;
	public boolean tubeless;
	
	public Bicycle() {
		System.out.println("No-argument constructor");
	}
	
	public Bicycle(String companyName[]) {
		System.out.println("1 array Argument constructor");
		this.companyName=companyName;
		for(int i=0;i<companyName.length;i++) {
			System.out.println(companyName[i]);
		}
	}
	public Bicycle(String companyName[],String type[]) {
		System.out.println("2 array argument constructor");
		this.companyName=companyName;
		for(int i=0;i<companyName.length;i++) {
			System.out.println("Company names:"+companyName[i]);
		}
		this.type=type;
		for(int i=0;i<type.length;i++) {
			System.out.println("Type of Bicycle:"+type[i]);
		}
	}
	public Bicycle(String companyName[],String type[],int gears[]) {
		System.out.println("3 array argument constructor");
		this.companyName=companyName;
		for(int i=0;i<companyName.length;i++) {
			System.out.println("Company names:"+companyName[i]);
		}
		this.type=type;
		for(int i=0;i<type.length;i++) {
			System.out.println("Type of Bicycle:"+type[i]);
		}
		this.gears=gears;
		for(int i=0;i<gears.length;i++) {
			System.out.println("Number of gears:"+gears[i]);
		}
		
	}
	public Bicycle(int brakes) {
		System.out.println("1 argument constructor");
		this.brakes=brakes;
	}
	public Bicycle(int brakes,int carrier) {
		System.out.println("2 Argument constructor");
		this.carrier=carrier;
	}
	public Bicycle(int brakes,int carrier,boolean tubeless) {
		System.out.println("3 Argument constructor");
		this.tubeless=tubeless;
	}
	public Bicycle(String type[],int carrier) {
		System.out.println("1 argument with 1 array constructor");
		this.type=type;
		for(int i=0;i<type.length;i++) {
			System.out.println("Type of Bicycle:"+type[i]);
		}
		this.carrier=carrier;
	}
	public Bicycle(int brakes,int carrier,boolean tubeless,String type[]) {
		System.out.println("3 arguments with 1 array constructor");
		this.brakes=brakes;
		this.carrier=carrier;
		this.tubeless=tubeless;
		this.type=type;
		for(int i=0;i<type.length;i++) {
			System.out.println("Type of Bicycle:"+type[i]);
	}
	}
	public Bicycle(String companyName[],String type[],int gears[],int brakes,int carrier,boolean tubeless) {
		System.out.println("All Arguments Constructor");
		this.companyName=companyName;
		for(int i=0;i<companyName.length;i++) {
			System.out.println("Company names:"+companyName[i]);
		}
		this.type=type;
		for(int i=0;i<type.length;i++) {
			System.out.println("Type of Bicycle:"+type[i]);
		}
		this.gears=gears;
		for(int i=0;i<gears.length;i++) {
			System.out.println("Number of gears:"+gears[i]);
		}
		this.brakes=brakes;
		this.carrier=carrier;
		this.tubeless=tubeless;
		
	}
public void displayBicycle() {
	System.out.println("Company Name:"+this.companyName);
	System.out.println("Types of bicycle:"+this.type);
	System.out.println("Number of gears:"+this.gears);
	System.out.println("Number of brakes:"+this.brakes);
	System.out.println("Number of carriers:"+this.carrier);
	System.out.println("Tubeless tyre:"+this.tubeless);
	
	

}
}

package com.xworkz.constructor.things;

public class Festival {
	public String festname;
	public int days;
	public boolean newdress;
	public int people;
	public String offering;
	
	public Festival(){
		System.out.println("This is a default constructor");
	}
	public Festival(String festname,int days,boolean newdress,int people,String offering) {
		System.out.println("This is a parameterized constructor");
		this.festname=festname;
		this.days=days;
		this.newdress=newdress;
		this.people=people;
		this.offering=offering;
	}
	public void displayFestival() {
		System.out.println("Festival name:"+this.festname);
		System.out.println("No. of days:"+this.days);
		System.out.println("Wear newdress:"+this.newdress);
		System.out.println("No. of people attended:"+this.people);
		System.out.println("Offerings offered:"+this.offering);
	}
	

}


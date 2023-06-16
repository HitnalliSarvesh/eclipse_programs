package com.xworkz.constructor.things;

public class Speakers {
	public String company;
	public String type;
	public int size;
	public float range;
	public int sensitivity;
	
	public Speakers() {
		System.out.println("This is a default constructor");
	}
	public Speakers(String company,String type,int size,float range,int sensitivity) {
		System.out.println("This is a parameterized constructor");
		this.company=company;
		this.type=type;
		this.size=size;
		this.range=range;
		this.sensitivity=sensitivity;
	}
	public void displayStaff() {
		System.out.println("Name of the company:"+this.company);
		System.out.println("Type of speakers:"+this.type);
		System.out.println("Size of speakers in cms:"+this.size);
		System.out.println("Range of the speakers in Hz:"+this.range);
		System.out.println("Sensitivity of speakers in dB:"+this.sensitivity);
	}
	

}

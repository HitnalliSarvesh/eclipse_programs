package com.xworkz.constructor.things;

public class Exam {

	public String name;
	public String type;
	public int maxmarks;
	public boolean negative;
	public int regstudents;
	
	public Exam() {
		System.out.println("This is a default constructor");
	}
	public Exam(String name,String type,int maxmarks,boolean negative,int regstudents) {
		System.out.println("This is a prameterized constructer");
		this.name=name;
		this.type=type;
		this.maxmarks=maxmarks;
		this.negative=negative;
		this.regstudents=regstudents;
	}
	public void displayStaff() {
		System.out.println("Name of the exam:"+this.name);
		System.out.println("Type of the exam:"+this.type);
		System.out.println("Maximum marks:"+this.maxmarks);
		System.out.println("Negative marking:"+this.negative);
		System.out.println("Number of Registered Students:"+this.regstudents);
	}
}

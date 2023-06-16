package com.xworkz.constructor.things;

public class Country {

	public String name;
	public int states;
	public int unionterritories;
	public double population;
	public String longestRiver;
	
	public Country() {
		System.out.println("This is default constructor");
	}
	
	public Country(String name,int states,int unionterritories,double population,String longestRiver) {
		
	System.out.println("This is parameterized constructor");	
	this.name=name;
	this.states=states;
	this.unionterritories=unionterritories;
	this.population=population;
	this.longestRiver=longestRiver;
	
	}
	
	public void displayStaff() {
		System.out.println("Name of the Country:"+this.name);
		System.out.println("Number of States:"+this.states);
		System.out.println("Number of Union territories:"+this.unionterritories);
		System.out.println("Population in crores:"+this.population);
		System.out.println("Longest River of the country is:"+longestRiver);
	}
}

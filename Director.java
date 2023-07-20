package com.xworkz.association;

public class Director {
	String name;
	String surname;
	int numOfMovie=10;
	String rating;

	public Director(String name,String surname,int numOfMovie,String rating) {
		System.out.println("Invoking Constructor of Director class");
		this.name=name;
		this.surname=surname;
		this.numOfMovie=numOfMovie;
		this.rating=rating;


	}
	void setAddress(String surname) {
		System.out.println("Invoking Method of Director class");
		this.surname=surname;

	}
	void print_InfoDirector() {
		System.out.println("Name:"+this.name);
		System.out.println("Surname:"+this.surname);
		System.out.println("Number of Movie:"+this.numOfMovie);
		System.out.println("Rating:"+this.rating);
	}

}

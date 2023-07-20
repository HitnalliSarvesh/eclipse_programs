package com.xworkz.association;

public class Movie {
	String name;
	String releaseDate="15/03/2022";
	int budget;
	String directorName;
	
	Director director=new Director("Subhas","Ghai",50, "8.9");

	public Movie(String name,String releaseDate,int budget,String directorName) {
		System.out.println("Constructor of movie class");
		this.name=name;
		this.releaseDate=releaseDate;
		this.budget=budget;
		this.directorName=directorName;
	}
	void setBudget(int budget) {
		this.budget=budget;

	}
	void print_info() {
		System.out.println("Name:" +this.name);
		System.out.println("Release Date:" +this.releaseDate);
		System.out.println("Budget:" +this.budget);
		System.out.println("Director Name:" +this.directorName);
		director.print_InfoDirector();

	}

}

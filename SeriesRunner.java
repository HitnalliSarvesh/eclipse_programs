package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Series;

public class SeriesRunner {
	public static void main(String args[]) {
		Series s1=new Series();
		
		String name[]= {"Bhaukal","FamilyMan","Mirzapur"};
		Series s2=new Series(name);
		
		String name1[]= {"Bhaukal","FamilyMan","Mirzapur"};
		String budget[]= {"50cr","100cr","150cr"};
		Series s3=new Series(name1,budget);
		
		String name2[]= {"Bhaukal","FamilyMan","Mirzapur"};
		String budget1[]= {"50cr","100cr","150cr"};
		String actorName[]= {"Mohit","Manoj","Pankaj"};
		Series s4=new Series(name2,budget1,actorName);
		
		String availableon ="Hotstar";
		Series s5=new Series(availableon);
		s5.displaySeries();
		
		String availableon1 ="Hotstar";
		String genre ="CrimeThriller";
		Series s6=new Series(availableon,genre);
		s6.displaySeries();
		
		String availableon2 ="Hotstar";
		String genre1 ="CrimeThriller";
		float rating =5.0f;
		Series s7=new Series(availableon,genre1,rating);
		s7.displaySeries();
		
		String genre2 ="CrimeThriller";
		String budget2[] ={"50cr","100cr","150cr"};
		Series s8=new Series(genre2,budget2);
		s8.displaySeries();
		
		String availableon3 ="Hotstar";
		String genre3 ="CrimeThriller";
		float rating2 =5.0f;
		String budget3[]={"50cr","100cr","150cr"};
		Series s9=new Series(availableon3,genre3,rating2,budget3);
		s9.displaySeries();
		
		String availableon4 ="Hotstar";
		String genre4 ="CrimeThriller";
		float rating3 =5.0f;
		String name3[]= {"Bhaukal","FamilyMan","Mirzapur"};
		String budget4[]= {"50cr","100cr","150cr"};
		String actorName2[]= {"Mohit","Manoj","Pankaj"};
		Series s10=new Series(name3,budget4,actorName2,availableon4,genre4,rating3);
		s10.displaySeries();
		
		
		
		

	}

}

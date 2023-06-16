package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Country;

public class CountryRunner {
	public static void main(String args[]) {
		Country hash=new Country();
		Country country=new Country("INDIA",28,8,140.76d,"Ganga");
		
		if(country!= null) {
			System.out.println("Object is null");
		}
				country.displayStaff();
	}

}

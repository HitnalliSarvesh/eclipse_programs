package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Drink;

public class DrinkRunner {
	public static void main(String args[]) {
		Drink drink=new Drink();
		Drink drink2=new Drink("Frooti",50,"Soft Drink",true,4.3f);
		
		if(drink2!=null) {
			System.out.println("Object is not null");
		}
		drink2.displayStaff();
	}

}

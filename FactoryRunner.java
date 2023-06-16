package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Factory;

public class FactoryRunner {
public static void main(String args[]) {
	Factory num1 = new Factory();
	Factory num2 = new Factory("Automotives","Production",100,40,10,50,"Gears",true,500,4.3f);
	
	
	if(num2 != null) {
		System.out.println("Object is not null");
		num2.displayStaff();
		
	}
	
}
}

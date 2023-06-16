package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Shoes;

public class ShoesRunner {
	public static void main(String args[]) {
		Shoes shoe1=new Shoes();
		Shoes shoe2=new Shoes("Adidas","Sports","Black",true,2000);
		
		if(shoe2!=null) {
			System.out.println("Object is not null");
		}
		shoe2.displayStaff();
	}

}

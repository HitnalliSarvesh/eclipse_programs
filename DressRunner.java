package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Dress;

public class DressRunner {
	public static void main(String args[]) {
		Dress d1=new Dress();
		Dress d2=new Dress("Shirt","USPA",34,2000,4.8f);
		
		if(d2!=null) {
			System.out.println("Object is not null");
		}
		d2.displayDress();
	}

}

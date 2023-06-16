package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Snacks;

public class SnacksRunner {
	public static void main(String args[]) {
		Snacks snack1=new Snacks();
		Snacks snack2=new Snacks("GobiManchuri","StreetFood",50,4.5f,"BTM streetcorner");
		
		if(snack2!=null) {
			System.out.println("Object is not null");
		}
		snack2.displaySnacks();
	}

}

package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Festival;

public class FestivalRunner {
	public static void main(String args[]) {
		Festival fest=new Festival();
		Festival fest2=new Festival("Ganesh Chaturthi",5,true,100,"Modak");
		
		if(fest2!=null) {
			System.out.println("Object is null");
		}
		
		fest2.displayFestival();
	}

}

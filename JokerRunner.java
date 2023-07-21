package com.xworkz.finalkyeword.runner;

import com.xworkz.finalkeyword.Joker;

public class JokerRunner {
	public static void main(String args[]) {
		Joker joker = new Joker();
		String ref = joker.toString();
		System.out.println(ref);
		
		Joker joker1 = new Joker("RAMBO CIRCUS", "Tommy", 55, 20, "Strong", "20 minutes", 3.5f, "Marshial Arts");
		String ref1 = joker1.toString();
		System.out.println(ref1);
		
		Joker joker2 = new Joker("RAMBO CIRCUS", "Tommy", 55, 20, "Strong", "20 minutes", 3.5f, "Marshial Arts");
		boolean result = joker1.equals(joker2);
		System.out.println(result);
		
		Joker joker3 = new Joker("TOODLE CIRCUS", "Vaxy", 45, 10, "Week", "40 minutes", 4.5f, "Jumping Arts");
		boolean result1 = joker2.equals(joker3);
		System.out.println(result1);
		
		Joker joker4 = new Joker("CARTERS CIRCUS", "Katy", 50, 15, "Medium Strong", "50 minutes", 4.9f, "Circular Jumping Arts");
		boolean result2 = joker3.equals(joker4);
		System.out.println(result2);
		
	}

}

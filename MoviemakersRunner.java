package com.xworkz.finalkyeword.runner;

import com.xworkz.finalkeyword.Moviemakers;

public class MoviemakersRunner {
	public static void main(String args[]) {
		Moviemakers moviemakers = new Moviemakers();
		String ref = moviemakers.toString();
		System.out.println(ref);
		
		Moviemakers moviemakers1 = new Moviemakers("Siddarth Anand", "Aditya Chopra", "Abbas Tyrewala", "Shridhar Raghavan", "Anand", "Satchith Paulose", 
				"Aarif Sheikh", "Vishal-Shekar", "YashRaj films", "Karan Johar");
		String ref2 = moviemakers1.toString();
		System.out.println(ref2);
		
		Moviemakers moviemakers2 = new Moviemakers("Siddarth Anand", "Aditya Chopra", "Abbas Tyrewala", "Shridhar Raghavan", "Anand", "Satchith Paulose", 
				"Aarif Sheikh", "Vishal-Shekar", "YashRaj films", "Karan Johar");
		boolean result = moviemakers1.equals(moviemakers2);
		System.out.println(result);
		
		Moviemakers moviemakers3 = new Moviemakers("Ajay Devgan", "Bhushan Kumar", "Krishnan Kumar", "Sanjay Mishra", "Lokesh", "Aseem Bajaj",  
				"Dharmendra Sharma", "Ravi Basrur", "PVR Pictures", "Deepak Dobriyal");
		boolean result1 = moviemakers2.equals(moviemakers3);
		System.out.println(result1);
		
		Moviemakers moviemakers4 = new Moviemakers("Subhas Ghai", "Javed Siddiqui", "Apurva Agnihotri", "Alok Nath", "Neeraj Pathak", "Kabir Lal",  
				"Renu Saluja", "Nadeem-Shravan", "Mukta Arts", "Himani Shivpuri");
		boolean result2 = moviemakers3.equals(moviemakers4);
		System.out.println(result2);
		
		
		
	}

}

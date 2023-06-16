package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Speakers;

public class SpeakersRunner {
	public static void main(String main[]) {
		Speakers speaker = new Speakers();
		Speakers speaker1 = new Speakers("Lyodlee","Traditionalspeakers",100,2200.5f,90);
		
		if(speaker1!=null) {
			System.out.println("Object is not null");
		}
		speaker1.displayStaff();
	}
	

}

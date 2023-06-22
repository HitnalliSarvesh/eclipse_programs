package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Pogo;

public class PogoRunner {
	public static void main(String args[]) {
		Pogo pogo = new Pogo();
		pogo.setType("Cartoon");
		pogo.setNumOfShows(10);
		pogo.setAnimation("CN Network");
		pogo.setFounder("Brad Hogg");
		pogo.setDurationOfEachShow("30 minutes");
		pogo.setViewers(500);
		pogo.setCharge(50);
		pogo.setService(true);
		pogo.setSubscribers("1000 plus subscribers");
		pogo.setMode("Offline");
		System.out.println(pogo.getType());
		System.out.println(pogo.getNumOfShows());
		System.out.println(pogo.getAnimation());
		System.out.println(pogo.getFounder());
		System.out.println(pogo.getDurationOfEachShow());
		System.out.println(pogo.getViewers());
		System.out.println(pogo.getCharge());
		System.out.println(pogo.getService());
		System.out.println(pogo.getSubscribers());
		System.out.println(pogo.getMode());
		
	}

}

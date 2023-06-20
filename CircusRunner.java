
package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Circus;

public class CircusRunner {
	public static void main(String args[]) {
		Circus c1=new Circus();
		
		String animals[]= {"Elephant","Monkey","Dogs"};
		Circus c2=new Circus(animals);
		
		String animals1[]= {"Elephant","Monkey","Dogs"};
		String ticketPrice[]= {"1500-F","1000-M","500-B"};
		Circus c3=new Circus(animals1,ticketPrice);
		
		String animals2[]= {"Elephant","Monkey","Dogs"};
		String ticketPrice1[]= {"1500-F","1000-M","500-B"};
		String showTimings[]= {"4pm","6pm","8pm"};
		Circus c4=new Circus(animals2,ticketPrice1,showTimings);
		
		String name="Rambo_Circus";
		Circus c5=new Circus(name);
		c5.displayCircus();
		
		String name1="Rambo_Circus";
		String location="Palace Ground";
		Circus c6=new Circus(name1,location);
		c6.displayCircus();
		
		String name2="Rambo_Circus";
		String location1="Palace Ground";
		int performers=150;
		Circus c7=new Circus(name2,location1,performers);
		c7.displayCircus();
		
		String name3="Rambo_Circus";
		String animals3[]= {"Elephant","Monkey","Dogs"};
		Circus c8=new Circus(name3,animals3);
		c8.displayCircus();
		
		String name4="Rambo_Circus";
		String location2="Palace Ground";
		int performers1=150;
		String showTimings1[]= {"4pm","6pm","8pm"};
		Circus c9=new Circus(name4,location2,performers1,showTimings1);
		c9.displayCircus();
		
		
		String animals4[]= {"Elephant","Monkey","Dogs"};
		String ticketPrice2[]= {"1500-F","1000-M","500-B"};
		String showTimings2[]= {"4pm","6pm","8pm"};
		String name5="Rambo_Circus";
		String location3="Palace Ground";
		int performers2=150;
		Circus c10=new Circus(animals4,ticketPrice2,showTimings2,name5,location3,performers2);
		c10.displayCircus();
			
	}

}

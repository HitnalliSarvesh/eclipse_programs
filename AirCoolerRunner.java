package com.xworkz.instancemethod.runner;

import com.xworkz.instancemethod.things.AirCooler;

public class AirCoolerRunner {
	public static void main(String args[]) {
		AirCooler ac= new AirCooler();
		ac.setTemperature(9);
		String weather=ac.weather(ac.getTemperature());	
		System.out.println("Weather is:"+weather);
		System.out.println(ac.getWeather(weather));
		ac.setTemperature(18);
		String weather1=ac.weather(ac.getTemperature());
		System.out.println("Weather is:"+weather1);
		System.out.println(ac.getWeather(weather1));
		ac.setTemperature(25);
		String weather2=ac.weather(ac.getTemperature());
		System.out.println("Weather is:"+weather2);
		System.out.println(ac.getWeather(weather2));
		ac.setTemperature(35);
		String weather3=ac.weather(ac.getTemperature());
		System.out.println("Weather is:"+weather3);
		System.out.println(ac.getWeather(weather3));
		
		
	}

}

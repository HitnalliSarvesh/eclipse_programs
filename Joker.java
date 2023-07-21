package com.xworkz.finalkeyword;

public class Joker {
	String circusName;
	String jokerName;
	int flightSpeed;
	int noOfJokers;
	String strength;
	String durability;
	float painResistance;
	String skill;
	
	public Joker() {
		System.out.println("This is no-argument constructor for Joker Class");
	}

	public Joker(String circusName, String jokerName, int flightSpeed, int noOfJokers, String strength, String durability,
			float painResistance, String skill) {
		this.circusName = circusName;
		this.jokerName = jokerName;
		this.flightSpeed = flightSpeed;
		this.noOfJokers = noOfJokers;
		this.strength = strength;
		this.durability = durability;
		this.painResistance = painResistance;
		this.skill = skill;
	}
	public String toString() {
		return "[circusName='"+circusName+"', "+" jokerName='"+jokerName+"', "+" flightSpeed='"+flightSpeed+"', "+" noOfJokers='"+noOfJokers+"', "
				+ ""+" strength='"+strength+"', "+" durability='"+durability+"', "+" painResistance='"+painResistance+"', "+" skill='"+skill+"']";
	}
	
	public boolean equals(Object obj) {
		if(obj==null)
		return false;
		
		if(getClass()!=obj.getClass())   
			return false;
			
			Joker jkr = (Joker)obj;   
			if(this.circusName==jkr.circusName && this.jokerName==jkr.jokerName && this.flightSpeed==jkr.flightSpeed && this.noOfJokers==jkr.noOfJokers 
					&& this.strength==jkr.strength && this.durability==jkr.durability && this.painResistance==jkr.painResistance && this.skill==jkr.skill)
				return true;
			return false;
	}
	
	
	

}

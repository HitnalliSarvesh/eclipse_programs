package com.xworkz.finalkeyword;

public class OTT {
	String name;
	int noOfFilms;
	
	
	public OTT() {
		System.out.println("This is no-argument constructor for OTT class");
	}
	public OTT(String name,int noOfFilms) {
		this.name=name;
		this.noOfFilms=noOfFilms;
	}
	public String toString() {
		return "OTT[name='"+name+"' ,"+" noOfFilms='"+noOfFilms+"']";
	}
	
	public boolean equals(Object obj) {
		if(obj==null)
		return false;
		
		if(getClass()!=obj.getClass())   
			return false;
			
			OTT o = (OTT)obj;   
			if(this.name==o.name && this.noOfFilms==o.noOfFilms)
				return true;
			return false;
		
		
		
	}

}

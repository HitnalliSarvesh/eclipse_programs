package com.xworkz.finalkyeword.runner;

import com.xworkz.finalkeyword.Steel;

public class SteelRunner {
	public static void main(String[] args) {
		Steel steel = new Steel();
		String ref = steel.toString();
		System.out.println(ref);
		
		Steel steel1 = new Steel("Steel Rod","TNT",50, 3);
		String ref2 = steel1.toString();
		System.out.println(ref2);
		
		Steel steel2 = new Steel("Steel Rod","TNT",50, 3);
		boolean result=steel1.equals(steel2);
		System.out.println(result);
		
		Steel steel3 = new Steel("Steel Plate","EXT",40, 30);
		boolean result1=steel2.equals(steel3);
		System.out.println(result1);
		
		Steel steel4 = new Steel("Steel Pipe","RFS",20, 2);
		boolean result2=steel3.equals(steel4);
		System.out.println(result2);
	}

}

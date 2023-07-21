package com.xworkz.finalkyeword.runner;

import com.xworkz.finalkeyword.Iron;

public class IronRunner {
	public static void main(String[] args) {
		Iron iron = new Iron();
		String ref = iron.toString();
		System.out.println(ref);
		
		Iron iron1 = new Iron(1538,"HIGH","Ferromagnetic","Self Rust", "VeryHigh", 4);
		String ref2 = iron1.toString();
		System.out.println(ref2);
		
		Iron iron2 = new Iron(1538,"HIGH","Ferromagnetic","Self Rust", "VeryHigh", 4);
		boolean result=iron1.equals(iron2);
		System.out.println(result);
		
		Iron iron3 = new Iron(1600,"Medium","Magnetic","No-Rust", "High", 5);
		boolean result1=iron2.equals(iron3);
		System.out.println(result1);
		
		Iron iron4 = new Iron(1500,"Low","Non-Magnetic","Rust", "VeryHigh", 6);
		boolean result2=iron3.equals(iron4);
		System.out.println(result2);

}
}
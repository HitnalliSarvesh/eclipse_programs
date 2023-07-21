package com.xworkz.finalkyeword.runner;

import com.xworkz.finalkeyword.OTT;

public class OTTRunner {
	public static void main(String args[]) {
		OTT pltfrm = new OTT();
		String ref = pltfrm.toString();
		System.out.println(ref);
		
		OTT pltfrm1 = new OTT("HOTSTAR",500);
		String ref2 = pltfrm1.toString();
		System.out.println(ref2);
		
		OTT pltfrm2 = new OTT("AmazonPrime",400);
		boolean result=pltfrm1.equals(pltfrm2);
		System.out.println(result);
		
		OTT pltfrm3 = new OTT("Zee5",300);
		boolean result1 = pltfrm2.equals(pltfrm3);
		System.out.println(result1);
		
		OTT pltfrm4 = new OTT("HOTSTAR",500);
		boolean result2 = pltfrm1.equals(pltfrm4);
		System.out.println(result2);
	}

}

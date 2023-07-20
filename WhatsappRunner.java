package com.xworkz.inheritance.things;

public class WhatsappRunner {
	public static void main(String args[]) {
		WhatsappV2 v2 = new WhatsappV3();
		System.out.println("--------------------------------------------");
		WhatsappV1 v1 = new WhatsappV3();
		//Dynamic dispatcher- assigning child reference to parent class.
		System.out.println("--------------------------------------------");
		Object obj = new WhatsappV3();
		System.out.println("--------------------------------------------");
	    //WhatsappV3 v3 = (WhatsappV3) new WhatsappV2();
		// By this we understand that we cannot assign parent class reference to child class and we can assign child reference to parent class.
	}

}

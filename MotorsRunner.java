package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Motors;

public class MotorsRunner {
	public static void main(String args[]) {
		Motors m1=new Motors();
		
		String companyName[]= {"Honda","Tesla","Drift"};
		Motors m2=new Motors(companyName);
		
		String companyName1[]= {"Honda","Tesla","Drift"};
		int price[]= {10000,25000,15000};
		Motors m3=new Motors(companyName1,price);
		
		String companyName2[]= {"Honda","Tesla","Drift"};
		int price1[]= {10000,25000,15000};
		int speed[]= {300,500,400};
		Motors m4=new Motors(companyName2,price1,speed);
		
		String version="15mxt";
		Motors m5=new Motors(version);
		m5.displayMotors();
		
		String version1="15mxt";
		String power="15hP";
		Motors m6=new Motors(version1,power);
		m6.displayMotors();
		
		String version2="15mxt";
		String power1="15hP";
		float torque=18.5f;
		Motors m7=new Motors(version2,power1,torque);
		m7.displayMotors();
		
		
		String version3="15mxt";
		int price2[]= {10000,25000,15000};
		Motors m8=new Motors(version3,price2);
		m8.displayMotors();
		
		String version4="15mxt";
		String power2="15hP";
		float torque1=18.5f;
		int price3[]= {10000,25000,15000};
		Motors m9=new Motors(version4,power2,torque1,price3);
		m9.displayMotors();
		
		String companyName3[]={"Honda","Tesla","Drift"};
	    int price4[]={10000,25000,15000};
		int speed1[]={300,500,400};
		String version5="15mxt";
		String power3="15hP";
		float torque2=18.5f;
	    Motors m10=new Motors(companyName3,price4,speed1,version5,power3,torque2);
	    m10.displayMotors();
		
		
	}

}

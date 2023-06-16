package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Bicycle;

public class BicycleRunner {
	public static void main(String args[]) {
		Bicycle b1=new Bicycle();
		
		String companyName[]= {"Herculus","Hero","Rfb"};
		Bicycle b2=new Bicycle(companyName);
		
		String companyName1[]= {"Herculus","Hero","Rfb"};
		String type[]= {"Sports","mountain","tour"};
		Bicycle b3=new Bicycle(companyName1,type);
		
		
		String companyName2[]= {"Herculus","Hero","Rfb"};
		String type1[]={"Sports","mountain","tour"};
		int gears[]= {4,12,5};
		Bicycle b4=new Bicycle(companyName2,type1,gears);
		
		int brakes=2;
		Bicycle b5=new Bicycle(brakes);
		b5.displayBicycle();
		
		int carrier=1;
		Bicycle b6=new Bicycle(brakes,carrier);
		b6.displayBicycle();
		
		boolean tubeless=true;
		Bicycle b7=new Bicycle(brakes,carrier,tubeless);
		b7.displayBicycle();
		
		String type2[]= {"Sports","mountain","tour"};		
		int carrier1=1;
		Bicycle b8=new Bicycle(type2,carrier1);
		b8.displayBicycle();
		
		int brakes1=2;
		int carrier2=1;
		boolean tubeless1=true;
		String type3[]= {"Sports","mountain","tour"};
		Bicycle b9=new Bicycle(brakes1,carrier2,tubeless1,type3);
		b9.displayBicycle();
		
		String companyName3[]={"Herculus","Hero","Rfb"};
		String type4[]={"Sports","mountain","tour"};
		int gears1[]={4,12,5};
		int brakes2=2;
		int carrier3=1;
		boolean tubeless2=true;
		Bicycle b10=new Bicycle(companyName3,type4,gears1,brakes2,carrier3,tubeless2);
		b10.displayBicycle();
		
		
		
		
		
		
	}

}

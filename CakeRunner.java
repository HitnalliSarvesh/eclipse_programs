package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Cake;

public class CakeRunner {
   public static void main(String args[]) {
	   Cake cake = new Cake();
	   System.out.println("Assigning values to the instance variables");
	   cake.flavour="BlackForest";
	   cake.price=450;
	   cake.shape="Square";
	   cake.types="Pastry";
	   cake.weight=1.5f;
	   
	   System.out.println("Flavour of the cake is:"+cake.flavour);
	   System.out.println("Price of the cake is:"+cake.price);
	   System.out.println("Shape of the cake is:"+cake.shape);
	   System.out.println("Type of cake:"+cake.types);
	   System.out.println("Weight of the cake:"+cake.weight);
	   
   }
}

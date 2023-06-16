package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Car;

public class CarRunner {
	public static void main(String args[]) {
		Car c1=new Car();
		Car c2=new Car("Porsche","Sports Car",50000000,55.5f,40);
		
		if(c2!=null) {
			System.out.println("Object is not null");
		}
		c2.displayCar();
	}

}

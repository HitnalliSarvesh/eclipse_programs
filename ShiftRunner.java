package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Shift;

public class ShiftRunner {
public static void main(String args[]) {
	Shift packers = new Shift();
    Shift movers = new Shift("11:30AM","Morning",5,2,true,"Rajajinagar");
    
    movers.displayStaff();
    if(movers != null) {
    	System.out.println("Movers object is not null");
    	movers.displayStaff();
    }
    
 
}

}

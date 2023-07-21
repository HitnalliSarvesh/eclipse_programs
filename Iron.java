package com.xworkz.finalkeyword;

public class Iron {
	int meltingPoint;
	String thermalConductivity;
	String magneticProperty;
	String rustProperty;
	String electricalConductivity;
	int noOfIsotopes;
	
	public Iron() {
		System.out.println("This is no-argument constructor of Iron Class");
	}

	public Iron(int meltingPoint, String thermalConductivity, String magneticProperty, String rustProperty,
			String electricalConductivity, int noOfIsotopes) {
		this.meltingPoint = meltingPoint;
		this.thermalConductivity = thermalConductivity;
		this.magneticProperty = magneticProperty;
		this.rustProperty = rustProperty;
		this.electricalConductivity = electricalConductivity;
		this.noOfIsotopes = noOfIsotopes;
	}
	
	public String toString() {
		return "[meltingPoint='"+meltingPoint+"', "+" thermalConductivity='"+thermalConductivity+"', "+" magneticProperty='"+magneticProperty+"', "+" rustProperty='"+rustProperty+"', "+" electricalConductivity='"+electricalConductivity+"', "+" noOfIsotopes='"+noOfIsotopes+"']";
	}
	
	public boolean equals(Object obj) {
		if(obj==null)
		return false;
		
		if(getClass()!=obj.getClass())   
			return false;
			
			Iron fe = (Iron)obj;   
			if(this.meltingPoint==fe.meltingPoint && this.thermalConductivity==fe.thermalConductivity && this.magneticProperty==fe.magneticProperty 
					&& this.rustProperty==fe.rustProperty && this.electricalConductivity==fe.electricalConductivity && this.noOfIsotopes==fe.noOfIsotopes)
				return true;
			return false;
	}
}

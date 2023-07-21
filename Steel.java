package com.xworkz.finalkeyword;

public class Steel {
	String item;
	String company;
	int length;
	int width;
	
	public Steel() {
		System.out.println("This is no-argument constructor for Steel class");
	}
	public Steel(String item,String company, int length, int width) {
		this.item=item;
		this.company=company;
		this.length=length;
		this.width=width;
		
	}
	public String toString() {
		return "[item='"+item+"', "+" company='"+company+"', "+" length='"+length+"', "+" width='"+width+"']";
	}
	public boolean equals(Object obj) {
		if(obj==null)
		return false;
		
		if(getClass()!=obj.getClass())   
			return false;
			
			Steel st = (Steel)obj;   
			if(this.item==st.item && this.company==st.company && this.length==st.length && this.width==st.width)
				return true;
			return false;
	}
	

}

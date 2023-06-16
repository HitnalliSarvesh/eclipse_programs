package com.xworkz.constructor.things;

public class Factory {
	 
	public String name;
	public String type;
	public int machineworkers;
	public int productworkers;
	public int leads;
	public int machines;
	public String material;
	public boolean shift;
	public int products;
	public float rating;
	
	public Factory() {
		System.out.println("This is default constructor");
	}
	
	public Factory(String name,String type,int machineworkers,int productworkers,int leads,int machines,String material,boolean shift,int products,float rating) {
		System.out.println("This is parameterized constructor");
		this.name=name;
		this.type=type;
		this.machineworkers=machineworkers;
		this.productworkers=productworkers;
		this.leads=leads;
		this.machines=machines;
		this.material=material;
		this.shift=shift;
		this.products=products;
		this.rating=rating;
		
	}
		
		public void displayStaff() {
			System.out.println("Factory name:"+this.name);
					System.out.println("Factory type:"+this.type);
					System.out.println("No. of Machine workers:"+this.machineworkers);
					System.out.println("No. of Production workers:"+this.products);
					System.out.println("No. of Leads:"+this.leads);
					System.out.println("No. of Machines:"+this.machines);
					System.out.println("Material Produced:"+this.material);
					System.out.println("Shift working:"+this.shift);
					System.out.println("No. of Products produced:"+this.products);
					System.out.println("Rating of the factory:"+this.rating);
		}
		
	

}

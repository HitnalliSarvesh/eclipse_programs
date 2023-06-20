package com.xworkz.constructor.things;

public class Amazon {
	public String reviews;  
	public String productImages;
	public String productdescriptions;
	public String productVariation;
	public String offers;
	public String discounts;
	public String order;
	public String delivery;
	public String multipleAccounts;
	public String refund;
	
	public Amazon() {
		System.out.println("No-Argument constructor");
	}
	
	public Amazon(String reviews,String productImages,String productdescriptions,String productVariation,String offers,
			String discounts,String order,String delivery,String multipleAccounts,String refund) {
		
		System.out.println("All-Argument Constructor");
		this.reviews=reviews;
		this.productImages=productImages;
		this.productdescriptions=productdescriptions;
		this.productVariation=productVariation;
		this.offers=offers;
		this.discounts=discounts;
		this.order=order;
		this.delivery=delivery;
		this.multipleAccounts=multipleAccounts;
		this.refund=refund;	
	}
	
	public void shop() {
		System.out.println("Shop method");
	}
	public void watch() {
		System.out.println("Watch method");
	}
	public void pay() {
		System.out.println("Pay method");
	}
	public void multipleAccounts() {
		System.out.println("Multiple Accounts method");
	}
	public void exchangeAndReturn() {
		System.out.println("Exchange and Return method");
	}
	

}

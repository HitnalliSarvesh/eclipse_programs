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
	
	public void setReviews(String reviews) {          
		this.reviews=reviews;
	}
	public String getReviews() {
		return reviews;
	}
	public void setProductImages(String productImages) {          
		this.productImages=productImages;
	}
	public String getProductImages() {
		return productImages;
	}
	public void setProductdescriptions(String productdescriptions) {          
		this.productdescriptions=productdescriptions;
	}
	public String getProductdescriptions() {
		return productdescriptions;
	}
	public void setProductVariation(String productVariation) {          
		this.productVariation=productVariation;
	}
	public String getProductVariation() {
		return productVariation;
	}
	public void setOffers(String offers) {          
		this.offers=offers;
	}
	public String getOffers() {
		return offers;
	}
	public void setDiscounts(String discounts) {          
		this.discounts=discounts;
	}
	public String getDiscounts() {
		return discounts;
	}
	public void setOrder(String order) {          
		this.order=order;
	}
	public String getOrder() {
		return order;
	}
	public void setDelivery(String delivery ) {          
		this.delivery=delivery;
	}
	public String getDelivery() {
		return delivery;
	}
	public void setMultipleAccounts(String multipleAccounts) {          
		this.multipleAccounts=multipleAccounts;
	}
	public String getMultipleAccounts() {
		return multipleAccounts;
	}
	public void setRefund(String refund) {          
		this.refund=refund;
	}
	public String getRefund() {
		return refund;
	}
	
}

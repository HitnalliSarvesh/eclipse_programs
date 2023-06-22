package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Amazon;

public class AmazonRunner {
	public static void main(String args[]) {
		Amazon amazon=new Amazon();
		amazon.setReviews("Reviews");
		amazon.setProductImages("Display Product Images");
		amazon.setProductdescriptions("Display Product Descriptions");
		amazon.setProductVariation("Display variety of products");
		amazon.setOffers("Offers on products");
		amazon.setDiscounts("Discounts on products");
		amazon.setOrder("Order");
		amazon.setDelivery("Delivery");
		amazon.setMultipleAccounts("Using multiple accounts");
		amazon.setRefund("Refund on return");
		
		System.out.println(amazon.getReviews());
		System.out.println(amazon.getProductImages());
		System.out.println(amazon.getProductdescriptions());
		System.out.println(amazon.getProductVariation());
		System.out.println(amazon.getOffers());
		System.out.println(amazon.getDiscounts());
		System.out.println(amazon.getOrder());
		System.out.println(amazon.getDelivery());
		System.out.println(amazon.getMultipleAccounts());
		System.out.println(amazon.getRefund());
	}

}

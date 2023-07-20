package com.xworkz.finalkyeword.runner;

import com.xworkz.finalkeyword.Market;

public class MarketRunner {
	public static void main(String[] args) {

		Market market = new Market();
		Market market1 = new Market();
		boolean item= market.equals(market1);
		System.out.println(item);
		System.out.println(market.getClass());
		int hashcode=market.hashCode();
		System.out.println(hashcode);
		String market2 = market.toString();
		System.out.println(market2);

		System.out.println(market.clone());
		market.finalize();
	}
}



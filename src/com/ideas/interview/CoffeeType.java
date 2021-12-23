package com.ideas.interview;

public enum CoffeeType {
	BLACK(10), IRISH(10), CAPPUCHINO(10), MOCHA(10);
	
	private int price;
	
	CoffeeType(int i) {
		this.price = i;
	}

	public int getPrice() {
		return this.price;
	}
	
	
}

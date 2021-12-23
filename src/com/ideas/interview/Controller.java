package com.ideas.interview;

public class Controller {
	private final Display display;
	private final Barista barista;
	private CoffeeType coffeeType;
	private Cashier cashier;

	public Controller(Display display, Barista barista, Cashier cashier) {
		this.display = display;
		this.barista = barista;
		this.cashier = cashier;
		display.show("Please select a coffee type");
	}

	public void userWants(CoffeeType coffeeType) {
		this.coffeeType = coffeeType;
		display.show("Great Choice!, Please pay: " + coffeeType.getPrice());
	}
	
	public boolean acceptPayment(int cash, CoffeeType coffeeType) {
		cashier.setCashPayment(cash);
		cashier.setBillAmount(coffeeType.getPrice());
		return cashier.validatePayment();
	}

	
	public void dispense() {
		barista.serve(coffeeType);
		display.show("Please collect your delicious coffee");
	}
}

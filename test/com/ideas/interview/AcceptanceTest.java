package com.ideas.interview;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AcceptanceTest {

	private Controller controller;
	private Display display;
	private Barista barista;
	private Cashier cashier;

	@Test
	public void dispenseBlackCoffeeForFree() {
		powerUp();
		assertEquals("Please select a coffee type", display.currentMessage());
		userWants(CoffeeType.IRISH);
		assertEquals("Great Choice!, Please pay: " + CoffeeType.IRISH.getPrice(), display.currentMessage());
		assertTrue(controller.acceptPayment(10, CoffeeType.IRISH));
		controller.dispense();
		assertEquals(CoffeeType.IRISH, barista.servedCoffee());
		assertEquals("Please collect your delicious coffee", display.currentMessage());
	}

	private AcceptanceTest userWants(CoffeeType coffeeType) {
		controller.userWants(coffeeType);
		return this;
	}

	private void powerUp() {
		display = new Display();
		barista = new Barista();
		cashier = new Cashier();
		controller = new Controller(display, barista, cashier);
	}
}

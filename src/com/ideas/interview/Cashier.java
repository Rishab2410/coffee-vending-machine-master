package com.ideas.interview;

public class Cashier {
	private int cashPayment;
	private int billAmount;

	public void setCashPayment(int cashPayment) {
		this.cashPayment = cashPayment;
	}

	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}

	public int getCashPayment() {
		return cashPayment;
	}

	public int getBillAmount() {
		return billAmount;
	}

	public boolean validatePayment() {
		if (this.cashPayment == this.billAmount)
			return true;
		return false;
	}
}

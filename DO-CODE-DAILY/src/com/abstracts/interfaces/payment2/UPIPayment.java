package com.abstracts.interfaces.payment2;

public class UPIPayment implements Payment {

	@Override
	public void pay(double amount) {
		if (Payment.validateAmount(amount)) {
			System.out.println("UPI Payment :- " + amount);

		} else {
			System.out.println("Invalid Amount");
		}

	}

}

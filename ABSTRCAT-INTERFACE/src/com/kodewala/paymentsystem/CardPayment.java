package com.kodewala.paymentsystem;

public class CardPayment extends Payment {
	String cardNumber = "1234 -3464-4542";

	@Override
	public void makePayment() {
		System.out.println("Card Payment Sucessfully.");
		System.out.println("Card Number :- " + cardNumber);
		
	}
	public void validateCard() {
		System.out.println("Card Validated");
		System.out.println("=====Thank You=======");
	}

}

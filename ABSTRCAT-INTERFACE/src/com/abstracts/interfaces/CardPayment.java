package com.abstracts.interfaces;

public class CardPayment extends PaymentSystem {
	
	// This class also need to… Implement the… Abstract method or contract? Which is decided by payment system class.

	@Override
	public void pay() {
		System.out.println("pay");

	}

	@Override
	public void sucesspendPayment() {
		System.out.println("sucesspendPayment");

	}

	@Override
	public void stopPayment() {
		System.out.println("stopPayment");
	}

	@Override
	public void checkLimit() {
		// TODO Auto-generated method stub
		
	}

}



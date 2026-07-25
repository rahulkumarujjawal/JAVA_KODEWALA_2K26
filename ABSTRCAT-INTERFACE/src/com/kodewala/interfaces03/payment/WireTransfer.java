package com.kodewala.interfaces03.payment;

public class WireTransfer implements IPaymentSystem {

	@Override
	public void pay() {
		System.out.println("");
		IPaymentSystem.calculateConvFree(2000, 5);

	}

	@Override
	public void settele() {
		System.out.println("");

	}

}

package com.kodewala.interfaces03.payment;

public class UPI implements IPaymentSystem {

	@Override
	public void pay()
	{
		System.out.println("UPI().PAY.");
		IPaymentSystem.calculateConvFree(1000, 5);
	}

	@Override
	public void settele() {
		
	}
	 
	
	@Override
	public void checkBalance() {
		
	}

}

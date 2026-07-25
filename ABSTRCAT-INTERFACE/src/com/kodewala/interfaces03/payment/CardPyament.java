package com.kodewala.interfaces03.payment;

public class CardPyament implements IPaymentSystem {

	@Override
	public void pay() 
	{
		System.out.println("PayMent");
		IPaymentSystem.calculateConvFree(1000, 20);

		
	}

	@Override
	public void settele() {
		
	}

}

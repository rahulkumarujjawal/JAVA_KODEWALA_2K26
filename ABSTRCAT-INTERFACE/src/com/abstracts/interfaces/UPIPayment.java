package com.abstracts.interfaces;

public class UPIPayment  extends PaymentSystem{

	@Override
	public void pay() {
		
		
	  // And implementing classes will provide the Body.
		System.out.println("UPIPayment.pay");
		
		
		  // And implementing classes will provide the Body.
		
	}

	@Override
	public void sucesspendPayment() {
		System.out.println("UPIPayment.sucesspendPayment");
		
	}

	@Override
	public void stopPayment() {
		// -----  // And implementing classes will provide the Body.
		
		System.out.println("UPIPayment.stopPayment");
		
		
		// -------
				
	}

	@Override
	public void checkLimit() {
		// TODO Auto-generated method stub
		
	}
	

}

/*
 This class must implement all the abstract method, because you signed a contract. with abstract class. Now,
 you must implement all the abstract methods, all has been implemented,
 */


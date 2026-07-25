package com.abstracts.interfaces.payment2;

import java.util.logging.Logger;

public interface Payment {

	public abstract void pay(double amount);
	
    
	default void payBillPrint() {
         loging();
		System.out.println("Your Bill is Print");
		
	}

	static boolean validateAmount(double amount) {                           // static Utility Method
		return amount > 0;

	}

	private static void loging()                                              // private Helper Method (Java 9)

	{
		System.out.println("Loging Transaction..");
	}

}

package com.hdfc.bank.abstraction;

public class PayementProcessor {
	
	
	// exposing the required :-

	public int checkBalance(String userId, String pwd) {
		connectWithDataBase();
		getPasswordByUserId();
		doValidate();
		int balance = getBalanceFromDataBase();
		return balance;

		/*
		 * ---- this is the core logic-------
		 * 
		 * Connect with database get the user and password from database check the
		 * balance return the response
		 * 
		 * 
		 * 
		 * 
		 * These methods are public, so it can directly call, it can directly
              call, okay? This class can directly
             call these methods. So, instead of this, This class directly calls… This method, and perform the… logic.
             
             
              poor implementation, you're hiding by making, Implementation?
              Private. And how do you expose the functionality? By making method public.
		 */

	}

	
	// Hiding  the core Functionality :- 
	
	private void connectWithDataBase() {
		System.out.println("PayementProcessor.connectWithDataBase()");
	}

	private String getPasswordByUserId() {
		return "rahul@12929";

	}

	private boolean doValidate() {
		return true;

	}

	private int getBalanceFromDataBase() {
		return 12000;

	}
}

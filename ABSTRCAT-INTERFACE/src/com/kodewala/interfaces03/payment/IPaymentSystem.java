package com.kodewala.interfaces03.payment;

public interface IPaymentSystem {
	
	
	public void pay();

	public void settele();

	//java 8
	public default void checkBalance() {
		 connectToDB();
		System.out.println("checkBalance");
	}

// from java 8 onwords , you can write static method inside interfaces
	public static int calculateTxnFree(int amount, int txnPercentage) 
	{
		 connectToDB();
		int txnFree = amount * txnPercentage / 100;
		return txnFree;
	}

	public static int calculateConvFree(int amount, int txnPercentage)
	{
		 connectToDB();
		int txnFree = amount * txnPercentage / 100;
		return txnFree;
	}
	
	
	

	private static void connectToDB() {
		
		// 20 Line of Code   ---->database connection logic write here 
		System.out.println("connectToDB.DataBase");
	}

}

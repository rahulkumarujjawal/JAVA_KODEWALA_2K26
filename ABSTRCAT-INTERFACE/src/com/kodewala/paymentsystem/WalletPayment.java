package com.kodewala.paymentsystem;

public class WalletPayment  extends Payment{
	
	String walletName = "Paytm Wallet";

	@Override
	public void makePayment() 
	{
		System.out.println("wallet Payment Sucessfull.");
		System.out.println("Wallet :-  " + walletName);
		
	}
	
	public void checkWalletBalance() {
		System.out.println("Wallet Balance checked.");
	}

}

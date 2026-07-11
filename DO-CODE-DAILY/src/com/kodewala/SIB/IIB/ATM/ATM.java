package com.kodewala.SIB.IIB.ATM;

public class ATM {
	static String bankName = "bank of india";

	// sib
	static {
		System.out.println("=================================");
		System.out.println("ATM Software Loading...");
		System.out.println("Connecting to Bank Server...");
		System.out.println("Network Connected Successfully");
		System.out.println("Bank Name : " + bankName);
		System.out.println("=================================");

	}

	public ATM() {
		System.out.println("ATM Object Created ");
	}

	void withdrawMoney()

	{
		System.out.println("Withdraw Money Method Called");

	}

	void yourBalance() {
		System.out.println("Avilable balance is 85000");
	}
}

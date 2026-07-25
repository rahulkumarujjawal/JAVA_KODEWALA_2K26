package com.kodewala.practice.sib;

public class SIB {
	static String bankName = "state bank of India";

	static {

		System.out.println("=================================");
		System.out.println("ATM Software Loading...");
		System.out.println("Connecting to Bank Server...");
		System.out.println("Network Connected Successfully");
		System.out.println("Bank Name : " + bankName);
		System.out.println("=================================");
	}

	public SIB() {
		System.out.println("state bank of india constructor  is created");
	}

	public void moneyWithdraw() {
		System.out.println("5000 Moneywill be draw");
	}

	public void checkBalance() {
		System.out.println("Balance will be checked");
	}
}

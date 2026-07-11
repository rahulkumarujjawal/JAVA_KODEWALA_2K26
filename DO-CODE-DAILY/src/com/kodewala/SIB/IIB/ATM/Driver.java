package com.kodewala.SIB.IIB.ATM;

public class Driver extends ATM {
	public static void main(String[] args) {
		System.out.println( "main method Started");
		ATM atm1 = new ATM();
		atm1.withdrawMoney();
		
		ATM atm2 = new ATM();
		atm2.yourBalance();

		
	}

}

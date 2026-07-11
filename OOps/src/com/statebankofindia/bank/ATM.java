package com.statebankofindia.bank;

public class ATM {
	public static void main(String[] args) {
		Account account = new Account(50000, "rahul ujjawal"); 
		
		 
// 		int balance = account.checkBalance();
//  		System.out.println("Available balance :- " + balance);
		
		
// 		System.out.println("withdraw balance :- " +withdraw);
		
		
		
		System.out.println("Check Balance :- " + account.checkBalance());

		account.withdrawl(10000);
		System.out.println("Check Balance :- " + account.checkBalance());

	}
}

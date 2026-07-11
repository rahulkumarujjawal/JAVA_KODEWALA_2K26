package com.inheritance.sbi.account;

public class Driver {
	public static void main(String[] args) {

		// Account class object
		Account account = new Account();
		account.approveAccount();
		account.branchLocation();

		// savingAccount class object
		SavingAccount savingAccount = new SavingAccount();

		savingAccount.openAccount();
		int interest = savingAccount.calculateInterest(10000);

		System.out.println("Your Final Amount :-  " + interest);

		CurrentAccount currentAccount = new CurrentAccount();
		int currentAcccount = currentAccount.calculateInterest(25000);
		System.out.println("CurrentAccount :- " + currentAcccount);

		
		
		PremiumAccount premiumAccount  = new PremiumAccount();
		premiumAccount.freeAirportpass();
	}

}

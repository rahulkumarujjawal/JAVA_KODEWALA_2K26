package com.inheritance.sbi.account;

public class SavingAccount extends Account {

	// this class will be able to reuse all the functionalities of its parents
	// class (Account)
	
	int rate = 5;

	public int calculateInterest(int amount) {
		return amount * rate / 100;
	}

}

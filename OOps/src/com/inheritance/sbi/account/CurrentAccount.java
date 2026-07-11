package com.inheritance.sbi.account;

public class CurrentAccount extends Account {
	// this classs will be able to reuese all the functionalities of its parents
	// class (Account)
	
	
	int rate = 0;

	public int calculateInterest(int amount) {
		return amount * rate / 100;
	}

	public int foreexCharges() {
		return 0;
	}
}


/*  why not support  multiple inheritance  
 *
 * 
 * 
 * 
 */




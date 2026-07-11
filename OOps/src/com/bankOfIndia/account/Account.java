package com.bankOfIndia.account;

public class Account {

	// all the data/varibales should be privated

	private String name;
	private int balance;
	// if sombody wants to modify the using public method

	public String getName() { // get the name
		return name;
	}

	public void setName(String name) { // set the name
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {

		if (balance > 500) {
			this.balance = balance; // here will be modify allowing, modification controlled way

		} else {
			System.out.println("Minimum balance should be 500");

		}

	}
}

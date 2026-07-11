package com.encapsulation01.Sbiuser;

public class SbiUser {
	private String accountNumber;
	private String name;
	private String accountType;
	private int balance;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance > 500) {
			this.balance = balance;
		}else {
            System.out.println("Minimum balance should be 500");

		}

		
	}

}

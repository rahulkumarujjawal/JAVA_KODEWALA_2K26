package com.inheritance.sbi.account;

public class Account {

	// common attributes

	int balance;
	String name;
	String accountHolderName;
	String email;
	String address;
	String aadhaarNumber;
	String accountType;
	String branchCode;
	String ifscCode;
	String mobileNumber;
	String panNumber;
	private String password; // this will not be available for child class

	public void openAccount() {

		System.out.println("=====Welcome to open your Account=====");
	}

	public void closeAccount() {

		System.out.println("Close your Account ....");

	}

	public void approveAccount() {

		System.out.println("Approve your Account ....");
	}

	public void branchLocation() {
		System.out.println("Bank location will be  Benglore");
	}
}

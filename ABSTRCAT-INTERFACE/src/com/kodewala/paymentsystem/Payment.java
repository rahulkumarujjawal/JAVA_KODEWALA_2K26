package com.kodewala.paymentsystem;

public abstract class Payment {

	// instance variables

	int paymentId = 101;
	String customerName = "Rahul  Kumar Ujjawal Sharma";
	int age = 22;
	String location = "Benglore";
	double amount = 95000;
	String accountType = "Saving";

	// Default Constructor

	public Payment() {
		System.out.println("Payment Constructor Called");
	}

	// Created Methods

	public void paymentDeatils() {
		System.out.println("\n========== PAYMENT DETAILS ==========");
		System.out.println("Payment Id :- " + paymentId);
		System.out.println("Customer Name  :- " + customerName);
		System.out.println("Amount :- " + amount);
		System.out.println("AGE  :- " + age);
		System.out.println("Enter your Location :- " + location);
		System.out.println("Account Type :-" + accountType);

	}

	public void paymentStarted() {
		System.out.println("Payment Process Started");
	}

	public void paymentConpleted() {
		System.out.println("Payment Complted SucessFully");

	}
	
	// Abstract Method
	
	public abstract void makePayment();

	
}

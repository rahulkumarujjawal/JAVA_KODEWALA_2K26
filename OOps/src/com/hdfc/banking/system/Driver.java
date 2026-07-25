package com.hdfc.banking.system;

// client  this  is a user of this system..
public class Driver {
	public static void main(String[] args) {
		
		PaymentProcessor paymentProcessor1 = new PaymentProcessor(); // i have created object PaymentProcessor  class because 
		// i have call this method    processPayment 
		
		
		
		System.out.println("==========Your Payment Type ==========\n");
		
		CardPayment payment = new CardPayment();
		paymentProcessor1.processPayment(payment);
		
		//   paymentProcessor1   == Reference Variables in  PaymentProcessor class 
		// processPayment   === Object of  PaymentProcessor class 
		
		// --- (cardPayment)  == This is  reference variables in   CardPayment  in Object 
		
		
		
		GooglePayPayment payment2 = new GooglePayPayment();
		paymentProcessor1.processPayment(payment2);		
		
	// 	Payment payment3 =   new SbICardPayment();    // phone pay object, 
	// 	paymentProcessor1.processPayment(payment3);
		
		
		SbICardPayment sbICardPayment =  new SbICardPayment();
		paymentProcessor1.processPayment(sbICardPayment);
		
		
		System.out.println("\n=====Your Payment has been Sucessfully=====");
		
		
		
		
		
		
	}

}

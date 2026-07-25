package com.kodewala.paymentsystem;

public class PaymentProcessor 
{
	
	public void processPayment(Payment payment) {

		payment.paymentStarted();
		payment.paymentDeatils();
		payment.makePayment();
		payment.paymentConpleted();
	}

}

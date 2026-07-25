package com.hdfc.banking.system;

public class PaymentProcessor {
	public void processPayment(Payment payment) {             // parameter for this method. Parent class.

		payment.doPayment();                           //   . ---- Based on actual object method will be called
		
		
	//	Payment payment2 = new Payment();
	// 	Payment payment3 = new Payment();
		 
	}

}
//  Payment payment    --- Payment is  Parent Class  and payment is types of reference varaibles 
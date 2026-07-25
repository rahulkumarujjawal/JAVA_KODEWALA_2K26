package com.kodewala.paymentsystem;

public class Driver {
	public static void main(String[] args) {
		
	
	PaymentProcessor paymentProcessor = new PaymentProcessor();
	
	System.out.println("=====UPI PAYMENT=======");
	
	Payment payment1 = new UPIPayment();
	paymentProcessor.processPayment(payment1);
	
	
	System.out.println();
	System.out.println("=======Card Payment========");
	
	Payment payment2 = new CardPayment();
	paymentProcessor.processPayment(payment2);
	
	
	System.out.println();
	System.out.println("=======Wallet Payment========");
	
	Payment payment3 = new WalletPayment();
	paymentProcessor.processPayment(payment3);

}
}
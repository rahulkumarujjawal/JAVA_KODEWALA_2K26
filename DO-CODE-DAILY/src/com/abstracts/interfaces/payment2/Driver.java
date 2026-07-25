package com.abstracts.interfaces.payment2;

public class Driver {

	public static void main(String[] args) {
		Payment payment = new UPIPayment();
		payment.pay(500);
		payment.payBillPrint();
		System.out.println(Payment.validateAmount(200));
	}
	
}

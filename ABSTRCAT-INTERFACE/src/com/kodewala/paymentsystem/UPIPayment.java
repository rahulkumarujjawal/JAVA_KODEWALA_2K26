package com.kodewala.paymentsystem;

public class UPIPayment extends Payment {
	
	String UpiId = "rahulujjawal@sbi";

	@Override
	public void makePayment()
	
	{
		System.out.println("UPI  Payment SucessFully.");
		System.out.println("UPI Id:- " + UpiId);
		
	}
	public void veryfyUPI()
	
	{
		System.out.println("UPI Verified.");
		
	}
	
	
}

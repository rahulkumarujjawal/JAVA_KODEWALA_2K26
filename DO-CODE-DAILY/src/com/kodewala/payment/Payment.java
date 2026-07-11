package com.kodewala.payment;

public class Payment 
 {
	
	private static int liveScore = 0;

	private String paymnetRefId;
	private int amount;
	private String status;
	private String responce;
	
	{
		liveScore ++;
	}
	
	// field, Attributes ,data , variables 
	public Payment(String paymnetRefId, int amount, String status, String responce) 
	{

		this.paymnetRefId = paymnetRefId;
		this.amount = amount;
		this.status = status;
		this.responce = responce;
	}
	
	
	

}

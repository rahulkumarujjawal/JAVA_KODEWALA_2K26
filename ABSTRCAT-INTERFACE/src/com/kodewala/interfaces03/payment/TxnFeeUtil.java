package com.kodewala.interfaces03.payment;

public class TxnFeeUtil {

	public int calculateTxnFees(int amount , int taxPercentage) 
	{
		int txnFee = amount * taxPercentage / 100;
		return txnFee ;
		
		
	}

}

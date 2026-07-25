package com.kodewala.interfaces.payment;

public interface IBanking    // 100% contract based 
{
	public static final int max = 1000;  // only constant allowed 

	public abstract void payment();

	public abstract void stopPayment();

	void suspendPayment();                              // all the method are public and abstract -- by default 

	public abstract void stopCheque();

}

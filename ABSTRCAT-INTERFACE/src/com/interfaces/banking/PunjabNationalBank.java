package com.interfaces.banking;

public class PunjabNationalBank  implements IBankingSystem{

	
	
	@Override
	public void pay() {
		
		
	}

	@Override
	public void settle() {
		
	}

	@Override
	public void stopTxn() {
		
	}
	
	
	@Override
	public void printPassBook()    		                 // should be implemented by rural bank only  bankof jharkhand and rural
	{
		
		System.out.println("IBankingSystem.printPassBok()");
	}
}

package com.kodewala.interfaces.abstracts;

public abstract class ProductAddress {  // declare 

	public abstract void sendProductName();   // what 

	public abstract void sendLocation();
	public abstract void sendFullName();
	public abstract void sendLastName();


	public void doPayment() {  // defolt fiunctionallitiy 

	}
	
	public void sucessPayment() {
		
	}

}

class CardPayment extends ProductAddress {

	@Override
	public void sendProductName()  // what
	{
    // how 
		
		System.out.println("");
	}

	@Override
	public void sendLocation() 
	{ 
		System.out.println("");

	}

	@Override
	public void sendFullName()
	{
		System.out.println("");
	}

	@Override
	public void sendLastName() 
	
	{
		 System.out.println("");
	}

	
}


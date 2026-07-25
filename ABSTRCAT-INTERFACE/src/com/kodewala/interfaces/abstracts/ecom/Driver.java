package com.kodewala.interfaces.abstracts.ecom;

public class Driver {
	public static void main(String[] args) {
		RetailUsers reaRetailUsers = new  RetailUsers();
		reaRetailUsers.confirmOrder();
		reaRetailUsers.placeOrderId(101);
		reaRetailUsers.orderLocation("Near By Silk Board");
		reaRetailUsers.orderPrice(399);
		
		
		System.out.println();
		
		PremiumUsers premium =  new PremiumUsers();
		
		
		RetailUsers  retail = new RetailUsers();
		
		
		
		Resellers  ressResellers = new Resellers();
		
		
		
		
	   
	    
	    System.out.println("===Thank you =====");
	    
	}

}

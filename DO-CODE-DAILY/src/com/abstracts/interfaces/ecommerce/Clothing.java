package com.abstracts.interfaces.ecommerce;

public class Clothing  implements IProductSystem{

	@Override
	public void productBuy() {
		System.out.println("Buying Tshirt");
		int charge = IProductSystem.calculateDeliveryCharge(2999, 10);
		System.out.println("Delivery Charge :- " + charge);
		
	}

	@Override
	public void productDeliver() {
		System.out.println("T-Shirt Deliverd");
		
	}
	
	@Override
	public void checkStock() {
		System.out.println("Checking clothing status");
	}
}

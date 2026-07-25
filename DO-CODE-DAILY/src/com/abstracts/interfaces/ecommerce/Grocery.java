package com.abstracts.interfaces.ecommerce;

public class Grocery implements IProductSystem {

	@Override
	public void productBuy() {
		System.out.println("Buying Rice + Eggs");
		int  deliveryCharge  = IProductSystem.calculateDeliveryCharge(1299, 5);
		System.out.println("Delivery Charge :- "+ deliveryCharge);
		
		
	}

	@Override
	public void productDeliver() {
		System.out.println("Rice + Eggs Deliverd");
		
	}

}

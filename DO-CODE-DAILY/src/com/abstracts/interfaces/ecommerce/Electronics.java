package com.abstracts.interfaces.ecommerce;

public class Electronics implements IProductSystem {

	@Override
	public void productBuy() {
		System.out.println("Buying Mobile");
		int gstBill = IProductSystem.calculateGST(54500, 18);
	}

	@Override
	public void productDeliver() {
		System.out.println("Item is Deliver");
		
	}

}

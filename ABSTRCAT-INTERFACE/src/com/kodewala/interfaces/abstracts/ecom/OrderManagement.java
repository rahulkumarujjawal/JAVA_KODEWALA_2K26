package com.kodewala.interfaces.abstracts.ecom;

public abstract class OrderManagement {

	public abstract void placeOrder();

    public abstract void placeOrderId(int id);

	public abstract void editOrder();

	public abstract void confirmOrder();

	public abstract void orderLocation(String LOctaion);

	public abstract void orderPrice(int price);
	

	public void productReview() {
		System.out.println("it was good");

	}

}

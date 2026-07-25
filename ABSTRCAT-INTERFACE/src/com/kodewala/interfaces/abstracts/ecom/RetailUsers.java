package com.kodewala.interfaces.abstracts.ecom;

public class RetailUsers  extends OrderManagement {

	@Override
	public void placeOrder() {
		System.out.println("Your Order is SucessFull..");

	}

	@Override
	public void placeOrderId(int id) {
		System.out.println("Your Order Id :- 2283887");

	}

	@Override
	public void editOrder() {
		System.out.println("");

	}

	@Override
	public void confirmOrder() {
		System.out.println("Your order is Confirm ");

	}

	@Override
	public void orderLocation(String Loctaion) {
		System.out.println("Your Location :- " + Loctaion);
		
	}

	@Override
	public void orderPrice(int price) {
		System.out.println("Your Price :- " + price);
		
	}

	



}

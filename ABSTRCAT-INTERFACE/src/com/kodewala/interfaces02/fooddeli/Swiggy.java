package com.kodewala.interfaces02.fooddeli;

public class Swiggy implements FoodDelivery {

	@Override
	public void placeOrder()
	{
		
		System.out.println("=========================");
		System.out.println("Swiggy.placeOrder");
		
	}

	@Override
	public void orderLoctaion() {
		System.out.println("Swiggy.orderLoctaion");
	}

	@Override
	public void mobileNumber() {
		System.out.println("Swiggy.mobileNumber");
	}

	@Override
	public void orderItem() {
		System.out.println();
		System.out.println("Swiggy.orderItem");

	}

	@Override
	public void trackOrder() {
		System.out.println("Swiggy.trackOrder");
	}

	@Override
	public void makePayment() 
	{
		System.out.println();
		System.out.println("Swiggy.makePayment");

	}

	@Override
	public void reateOrder() {
   System.out.println("Swiggy.reateOrder");
	}

	@Override
	public void cancelOrder()
	{
		System.out.println("Swiggy.cancelOrder");
		System.out.println("======================");

	}

}

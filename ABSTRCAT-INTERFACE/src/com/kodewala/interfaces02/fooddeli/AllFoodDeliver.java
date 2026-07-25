package com.kodewala.interfaces02.fooddeli;

public class AllFoodDeliver {
	public void allFodDelivery(FoodDelivery Food)
	
	{
		
		Swiggy food = new Swiggy();
		
		Food.placeOrder();
		Food.orderLoctaion();
		Food.mobileNumber();
		Food.orderItem();
	    Food.trackOrder();
	    Food.makePayment();
	    Food.reateOrder();
	    Food.cancelOrder();
	}

}

package com.abstracts.interfaces.ecommerce;

public interface IProductSystem 
{
	
	
     // Java 7 Abstract Methods


	public abstract void productBuy();
	public abstract void productDeliver();

	
	
	public static int calculateGST(int price, int gstPercentage) {                          // Java 8 Static Method

	// 	connectionDataBase();
		int gstBill = price * gstPercentage /100;
		return gstBill;
	}
	
	
	
	
	
	public static int calculateDeliveryCharge(int price,int percentge) {                  // Java 8 Static Method

		// connectionDataBase();
		int deliveryCharge = price * percentge /100;
		return deliveryCharge;
	}
	
	  
	public default void checkStock() {                                                // Java 8 Default Method

		// connectionDataBase();
		System.out.println("Checking Product Stock");
	}

	
	
	
	
	private static void connectionDataBase() {                                   // Java 9 Private Static Method

		// Database connections Login 
		System.out.println("Data Base is Connected");
	}

}

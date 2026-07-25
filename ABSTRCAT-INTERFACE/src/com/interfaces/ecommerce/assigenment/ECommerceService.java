package com.interfaces.ecommerce.assigenment;

public interface ECommerceService {

// Mandatory methods (Contract)

	public abstract void productaDetail();

	public abstract void addToCart();

	public abstract void placeOrder();

	public abstract void makaPayment();

	public abstract void trackOrder();

	public abstract void mobileNumber();

	public abstract void productBrand();

	public abstract void email();

// ============================
// Java 8 Default Method
// Introduced for Backward Compatibility
// ============================

	public default void sendGift() {
		System.out.println("");
	}

// ============================
// Java 8 Static Method
// Common Utility Method
// ============================

	static double calculateGST(double amount) {

		return amount * 0.18;

	}

// ============================
// Java 9 Private Method
// Helper Method
// ============================

	private  void validateCustomer() {

		System.out.println("Customer Verified Successfully.");

	}

// Default Method Using Private Method

	default void cancelOrder() {

		validateCustomer();

		System.out.println("Order Cancelled Successfully.");

	}

}

package com.Flipcart;

class ShoppingBillApp {

	// Method 1 - No param, no return
	static void printHeader() {
		System.out.println("========================================");
		System.out.println("         SHOPPING BILL GENERATOR        ");
		System.out.println("========================================");
	}

	// Method 2 - With param, no return
	static void printCustomerInfo(String name, String type) {
		System.out.println("Customer  : " + name);
		System.out.println("Type      : " + type);
	}

	// Method 3 - With param, returns double
	static double calculateDiscount(String customerType, double price) {
		if (customerType.equals("Premium") && price >= 5000) {
			return price * 10 / 100;
		} else {
			return 0;
		}
	}

	// Method 4 - With param, returns double
	static double calculateDelivery(String customerType, double price) {
		if (customerType.equals("Premium") && price >= 1000) {
			return 0;
		} else {
			return 30;
		}
	}

	// Method 5 - Overloaded - returns total
	static double calculateTotal(double price, double discount, double delivery) {
		return (price - discount) + delivery;
	}

	// Method 6 - Print final bill
	static void printBill(String item, double price, double discount, double delivery, double total) {
		System.out.println("----------------------------------------");
		System.out.println("Item      : " + item);
		System.out.println("Price     : Rs." + price);
		System.out.println("Discount  : Rs." + discount);
		System.out.println("Delivery  : Rs." + delivery);
		System.out.println("----------------------------------------");
		System.out.println("TOTAL     : Rs." + total);
		System.out.println("========================================");
	}

	// ── MAIN ─────────────────────────────────────────────────────────────────
	public static void main(String[] args) {

		String itemName = "NIKE TRACK PAINT ";
		double price = 15000;
		String customerName = "RAHUL UJJAWAL SHARMA ";
		String customerType = "Premium";

		double discount = calculateDiscount(customerType, price);
		double delivery = calculateDelivery(customerType, price);
		double total = calculateTotal(price, discount, delivery);

		printHeader();
		printCustomerInfo(customerName, customerType);
		printBill(itemName, price, discount, delivery, total);
	}
}
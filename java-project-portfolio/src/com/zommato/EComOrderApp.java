package com.zommato;

public class EComOrderApp {

	// ── Helper Method 1: Calculate Discount ──────────────────────────────────
	static double calculateDiscount(String customerType, double price) {
		if (customerType.equals("Premium") && price >= 5000) {
			return price * 10 / 100;
		}
		return 0;
	}

	// ── Helper Method 2: Calculate Delivery ──────────────────────────────────
	static double calculateDelivery(String customerType, double price) {
		if (customerType.equals("Premium") && price >= 1000) {
			return 0;
		}
		return 30;
	}

	// ── Sub Task 3: Process Payment ───────────────────────────────────────────
	static String processPayment(String paymentMode, double totalAmount) {
		System.out.println("========================================");
		System.out.println("          PAYMENT PROCESSING            ");
		System.out.println("========================================");
		System.out.println("Payment Mode    : " + paymentMode);
		System.out.println("Amount          : Rs." + totalAmount);

		if (paymentMode.equals("UPI")) {
			System.out.println("Status          : Payment Successful via UPI!");
		} else if (paymentMode.equals("Card")) {
			System.out.println("Status          : Payment Successful via Card!");
		} else if (paymentMode.equals("COD")) {
			System.out.println("Status          : Cash on Delivery Selected.");
		} else {
			System.out.println("Status          : Invalid Payment Mode!");
			return "FAILED";
		}

		System.out.println("========================================");
		return "SUCCESS";
	}

	// ── Sub Task 1: Generate Invoice ──────────────────────────────────────────
	static void generateInvoice(String customerName, String itemName, double price, double discount, double delivery,
			double total) {

		System.out.println("========================================");
		System.out.println("              INVOICE                   ");
		System.out.println("========================================");
		System.out.println("Customer Name   : " + customerName);
		System.out.println("Item Ordered    : " + itemName);
		System.out.println("Item Price      : Rs." + price);
		System.out.println("Discount        : Rs." + discount);
		System.out.println("Delivery Charge : Rs." + delivery);
		System.out.println("----------------------------------------");
		System.out.println("TOTAL PAID      : Rs." + total);
		System.out.println("========================================");
	}

	// ── Sub Task 2: Send Order Email ──────────────────────────────────────────
	static void sendOrderUpdateEmail(String customerName, String email, String itemName, String orderId) {

		System.out.println("========================================");
		System.out.println("          ORDER UPDATE EMAIL            ");
		System.out.println("========================================");
		System.out.println("To       : " + email);
		System.out.println("Subject  : Your Order is Confirmed!");
		System.out.println("----------------------------------------");
		System.out.println("Dear " + customerName + ",");
		System.out.println("Your order for '" + itemName + "' is confirmed.");
		System.out.println("Order ID : " + orderId);
		System.out.println("Status   : Order Placed Successfully!");
		System.out.println("We will deliver your item soon.");
		System.out.println("Thank you for shopping with us!");
		System.out.println("========================================");
	}

	// ── Main Task: Place Order ────────────────────────────────────────────────
	static void placeOrder(String customerName, String email, String itemName, double price, String customerType,
			String paymentMode) {

		System.out.println("========================================");
		System.out.println("          PLACING YOUR ORDER...         ");
		System.out.println("========================================");
		System.out.println("Customer   : " + customerName);
		System.out.println("Item       : " + itemName);
		System.out.println("Price      : Rs." + price);
		System.out.println("========================================");

		double discount = calculateDiscount(customerType, price);
		double delivery = calculateDelivery(customerType, price);
		double total = (price - discount) + delivery;
		String orderId = "ORD" + (int) (Math.random() * 900000 + 100000);

		String payStatus = processPayment(paymentMode, total);

		if (payStatus.equals("SUCCESS")) {
			generateInvoice(customerName, itemName, price, discount, delivery, total);
			sendOrderUpdateEmail(customerName, email, itemName, orderId);
			System.out.println("  ORDER PLACED SUCCESSFULLY!  ");
			System.out.println("  Order ID : " + orderId);
		} else {
			System.out.println("ORDER FAILED — Please try a valid payment mode.");
		}
	}

	// ── MAIN ──────────────────────────────────────────────────────────────────
	public static void main(String[] args) {
		placeOrder("RAHUL UJJAWAL SHARMA",               // A - Customer Name
				"rahulujjawalsharma@gmail.com",          // B - Email
				"Apple MacBook pro",                     // C - Item Name
				255000,                                  // D - Price 
				"Premium",                              // E - Customer Type
				"UPI"                                   // F - Payment Mode
		);
	}
}

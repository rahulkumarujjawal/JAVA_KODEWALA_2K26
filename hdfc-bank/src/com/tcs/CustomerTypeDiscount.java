package com.tcs;

public class CustomerTypeDiscount {
	public static void main(String[] args) {

		String customerId = args[0];
		String customerName = args[1];
		String customerType = args[2];
		String purchaseAmountStr = args[3];

		int purchaseAmount = Integer.parseInt(purchaseAmountStr);
		int discountPercent = discountPercentage(customerType);
		int discountAmount = discountAmount(customerType, purchaseAmount);
		int finalAmount = finalAmount(customerType, purchaseAmount);

		System.out.println("------------------------------");

		System.out.println("Customer ID: " + customerId);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Customer Type: " + customerType);
		System.out.println("Purchase Amount: " + purchaseAmount);
		System.out.println("Discount Percentage: " + discountPercent + "%");
		System.out.println("Discount Amount: " + discountAmount);
		System.out.println("Final Amount to Pay: " + finalAmount);

		System.out.println("------------------------------");
		System.out.println("THANK YOU  VISIN AGAIN ! ! !");
		System.out.println("------------------------------");

	}

	public static int discountPercentage(String customerType) {
		if (customerType.equals("Regular")) {
			return 5;
		} else if (customerType.equals("Premium")) {
			return 10;
		} else if (customerType.equals("VIP")) {
			return 20;
		} else {
			return 0;

		}
	}

	public static int discountAmount(String customerType, int purchaseAmount) {
		int discountPercent = discountPercentage(customerType);
		int discountAmountIs = (purchaseAmount * discountPercent) / 100;
		return discountAmountIs;
	}

	public static int finalAmount(String customerType, int purchaseAmount) {
		int discountAmountIs = discountAmount(customerType, purchaseAmount);
		return purchaseAmount - discountAmountIs;

	}

}

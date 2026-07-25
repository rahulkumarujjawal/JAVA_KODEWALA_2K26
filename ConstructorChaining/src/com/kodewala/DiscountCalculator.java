package com.kodewala;

public class DiscountCalculator {
	public static void main(String[] args) {
		discount("SILVER");

	}

	private static void discount(String customerType) {

		switch (customerType) {
		case "SILVER":
			System.out.println("DiscountCalculator ... silver");
			break;

		case "GOLD":
			System.out.println("DiscountCalculator ... gold");
			break;

		default:
			System.out.println("You Unknown personType ......");
			break;
		}

	}
}

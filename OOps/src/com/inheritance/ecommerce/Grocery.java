package com.inheritance.ecommerce;

public class Grocery extends Product {

	String expiryDate = "31-Dec-2026";
	double weight = 2.5;

	public void displayGrocery() {

		System.out.println("===== GROCERY DETAILS =====");

	}

	public void addToCart() {

		System.out.println(productName + " Added To Cart.");

	}
}

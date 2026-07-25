package com.ecommerce.product;

public class Grocery extends Product {
	double price = 450.65;
	double weight = 4.5;
	String expiryDate = "31-july-2026";

	public void detailsGrocery() {
		
		System.out.println("\n==============Grocery Details==============");

		System.out.println("Price :- " + price);
		System.out.println("Weight :- " + weight + "Kg");
		System.out.println("Expiry Date :- " + expiryDate);
	}
	
	public void addToCart() {
		System.out.println("Added To Cart:-  " + productName);
	}

}

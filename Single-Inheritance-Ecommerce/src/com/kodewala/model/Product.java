package com.kodewala.model;

public class Product {

	String productName = "Laptop MackBook Air 2";
	double price = 55700;
	int model = 2026;

	public void productDetails() {
		System.out.println("\nProduct Name :- " + productName );
		System.out.println("\nPrice  :- " + price);
		System.out.println("\nProduct Model :- " + model);

	}
}

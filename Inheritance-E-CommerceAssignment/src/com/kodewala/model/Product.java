package com.kodewala.model;

public class Product {
	int productId;
	String productName;
	double price;

	public void acceptDetails() {

		productId = 101;
		productName = "Default Product";
		price = 1000;

	}

	public void displayDetails() {

		System.out.println("Product ID   : " + productId);
		System.out.println("Product Name : " + productName);
		System.out.println("Price        : " + price);

	}

	public double calculateDiscount() {
		return price;
	

	}

}

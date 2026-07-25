package com.kodewala.model;

public class Electronics extends Product {
	String brand;
	int warrantyYears;

	@Override
	public void acceptDetails() {

		productId = 101;
		productName = "Apple MacBook Pro";
		price = 80000;
		brand = "Apple";
		warrantyYears = 2;
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Brand  :- " + brand);
		System.out.println("Warranty Years :- " + warrantyYears);

	}

	@Override
	public double calculateDiscount() {
		if (price > 50000) {
			return price - (price * 0.10);
		}

	return price;

	}
}

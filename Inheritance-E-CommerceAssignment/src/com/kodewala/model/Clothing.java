package com.kodewala.model;

public class Clothing extends Product {

	String size;
	String color;

	@Override
	public void acceptDetails() {

		productId = 201;
		productName = "T-Shirt";
		price = 2500;
		
		
        size = "M";
		color = "Black";

	}

	@Override
	public void displayDetails() {
     super.displayDetails();

		System.out.println("Size  :- " + size);
		System.out.println("Color :- " + color);

	}

	@Override
	public double calculateDiscount() {

		if (price > 2000) {

			return price - (price * 0.20);
}

		return price;

	}

}

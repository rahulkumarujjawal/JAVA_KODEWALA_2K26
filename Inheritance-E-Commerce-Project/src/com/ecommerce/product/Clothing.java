package com.ecommerce.product;

public class Clothing extends Product {
	String size = "L";
	String color = "Black";
	String type = "T-shirt";
	String gender = "Male";
	String stock = "Yes";
	double rating = 4.5;

	public void detailsClothingProducts() {
		
		System.out.println("\n==========Clothing Deatils============");
		
		System.out.println("size :- " + size);
		System.out.println("Color :- " + color);
		System.out.println("Type :- " + type);
		System.out.println("Gender :- " + gender);
		System.out.println("Stock :- " + stock);
		System.out.println("Customer Rating :-  " + rating);

	}

	public void clothingTryOn() {
		System.out.println("Customer is trying the clothes.");
	}

}

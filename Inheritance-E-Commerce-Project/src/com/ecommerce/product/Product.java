package com.ecommerce.product;

public class Product { // Parent class
	
	
	int productId = 101;
	String productName = "Mobile Iphone 17 pro max ";
	double price = 7500.65;
	int quantitiy = 10;
	String location = "Benglore";

	public void addProduct() {
		System.out.println("Product added SucessFully");
	}

	public void productDetails() {
		
		System.out.println("\n==========Product Deatils==========");
		
		System.out.println("Product Id :- " +productId);
		System.out.println("Product Name :- " + productName);
        System.out.println("Price        :- " + price);
        System.out.println("Quantity     :- " + quantitiy);
        System.out.println("Location :-  "    +location);
        

		

	}
}

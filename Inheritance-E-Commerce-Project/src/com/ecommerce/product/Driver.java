package com.ecommerce.product;

public class Driver {
	public static void main(String[] args) {

		Electronics electronics = new Electronics();
		
		
		electronics.addProduct();
		electronics.productDetails();
		electronics.detailsElectronic();
		electronics.buyElectronic();
		
		

		System.out.println("=============================");

		Clothing clothing = new Clothing();
		
		clothing.productDetails();
		clothing.detailsClothingProducts();
		clothing.clothingTryOn();

		System.out.println("==================================");

		
		Grocery grocery = new Grocery();
		
		grocery.productDetails();
		grocery.detailsGrocery();
		System.out.println("==================================");

		grocery.addToCart();
	}
	

}

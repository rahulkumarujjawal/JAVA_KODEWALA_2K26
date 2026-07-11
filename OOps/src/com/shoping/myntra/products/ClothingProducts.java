package com.shoping.myntra.products;

public class ClothingProducts extends Product {
	
	
	
	
	
	String color = "all Type";
	String brand = "jockey";
	int  size = 32;
	String type = "Tshirt";
	int quantity = 2;
	
	public static void main(String[] args) {
		ClothingProducts clothing = new ClothingProducts();
		
		
		
		
		System.out.println("Brand :- "+ clothing.brand);
		System.out.println("Color :- " + clothing.color);
		System.out.println( "Size :- " + clothing.size);
		System.out.println("Type :- "+clothing.type);
		
	}

}

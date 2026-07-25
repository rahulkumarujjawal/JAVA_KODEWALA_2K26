package com.kodewala.overriding.overloading;

public class Product {
	private int productId;
	private String name;
	private boolean price;

	public int productDeatils() {
		System.out.println("This is product details ."); // functionality x
		return 100;

	}

}


class Clothing extends Product { // Author 2
	private int size;
	private String type;
	private String color;

	@Override
	public int productDeatils() { // overriding the parent class method inside child class

		System.out.println("This is a Clothing Product ."); // y Functionallity x write here functionallity { .....}
		return 50;
	}

}

 

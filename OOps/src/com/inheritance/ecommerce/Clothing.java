package com.inheritance.ecommerce;

public class Clothing extends Product {
	String size = "L";
	String color = "Black";

	public void displayClothing() {

		System.out.println("Size  : " + size);
		System.out.println("Color : " + color);

	}

	public void tryOn() {

		System.out.println("Customer is trying the clothes.");

	}

}

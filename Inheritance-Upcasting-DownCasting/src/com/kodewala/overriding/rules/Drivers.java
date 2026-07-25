package com.kodewala.overriding.rules;

class Product {

	public void productDetails(int id, String name, Double Price, String Brand) {
		System.out.println("Product Details are here");
	}

	public void priceDetails() {
		System.out.println("Price details here ..");
	}

}

class ElectronicProduct extends Product {

	@Override
	public void productDetails(int id, String name, Double Price, String Brand) {
		
		System.out.println("---------Product Details()----------- ");
		System.out.println("Id :- "+ id);
		System.out.println("Name :-" + name);
		System.out.println("Price :- " + Price);
		System.out.println("Brand :- " + Brand);
		
		System.out.println("---------------------------------------");

	}

}

public class Drivers {
	public static void main(String[] args) {
		
		ElectronicProduct electronic = new ElectronicProduct();
		electronic.productDetails(101, "Laptop", 8500.500, "Apple");

	}

}

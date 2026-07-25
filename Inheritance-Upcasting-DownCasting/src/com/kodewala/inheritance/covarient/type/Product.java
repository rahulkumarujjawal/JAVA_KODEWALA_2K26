package com.kodewala.inheritance.covarient.type;

public class Product {
	public  Product productDetails() {
		System.out.println("Your Product Details");
		return new Product();
	}

}


class Laptop extends Product{
	
}
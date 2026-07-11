package com.inheritance.ecommerce;

public class Electronics  extends Product{
	String brand = "Apple";
	int warranty = 2;

	public void buyElectronics() {

		System.out.println(productName + " Purchased Successfully.");

	}

}

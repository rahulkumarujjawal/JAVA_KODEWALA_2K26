package com.inheritance.ecommerce;

public class ProductDriver {

	public static void main(String[] args) {
		Electronics electronics = new Electronics();
		Clothing clothing = new Clothing();
		Grocery grocery = new Grocery();

		electronics.addProduct();
		electronics.buyElectronics();

		clothing.displayClothing();
		clothing.tryOn();

	

	}

}

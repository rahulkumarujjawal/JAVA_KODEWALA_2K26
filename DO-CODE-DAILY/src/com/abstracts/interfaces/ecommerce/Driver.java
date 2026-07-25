package com.abstracts.interfaces.ecommerce;

public class Driver {
	public static void main(String[] args) {
		IProductSystem electronic = new Electronics();

		System.out.println("==========================");

		electronic.productBuy();
		electronic.productDeliver();
		electronic.checkStock();

		System.out.println("==========================");

		IProductSystem clothng = new Clothing();
		clothng.productBuy();
		clothng.productDeliver();
		clothng.checkStock();

		System.out.println("==========================");

		IProductSystem grocery = new Grocery();
		grocery.productBuy();
		grocery.productDeliver();
		grocery.checkStock();

		System.out.println("==========================");

	}
}

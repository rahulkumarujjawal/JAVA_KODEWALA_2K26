package com.kodewala.interfaces02;

public class Grocery implements ECommerceProduct {

	@Override
	public void addProduct() {
		System.out.println("Grocery.ECommerceProduct");

	}

	@Override
	public void removeProduct() {
		System.out.println("ECommerceProduct.removeProduct");

	}

	@Override
	public void displayProduct() {
		System.out.println("displayProduct.Grocery");
	}

	@Override
	public void buyProduct() {

	}

	@Override
	public void addTOCart() {

	}

}

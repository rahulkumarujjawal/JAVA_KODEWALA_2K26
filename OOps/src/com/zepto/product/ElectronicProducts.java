package com.zepto.product;

public class ElectronicProducts extends Products {

	// properties from parents(Products)

	// 3 from parent class? One from this total four variable will be there.
	// That means the properties from super or parent class plus its own property.

	int yearsOfWarrenty = 2;

	public void showWarrentyDetails() {
		System.out.println("Electronic Products.showWarrentyDetails ");

	}

}

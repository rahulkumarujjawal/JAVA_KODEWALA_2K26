package com.ecommerce.product;
 
public class Electronics extends Product       {                //    child class Electronics

	String brand = "apple";
	int warrenty = 2;

	public void detailsElectronic() {
		System.out.println("\n=========Electronic Product Details============");
		
		System.out.println("Brand :-  " + brand);
		System.out.println("Warrenty :- " + warrenty +"years");

	}

	public void buyElectronic() {
		System.out.println("Purchased Sucessfully :- " + productName);
	}

//	public void productDetails() {
//		System.out.println("You can Test  Before buy this Product.");
//	}
}

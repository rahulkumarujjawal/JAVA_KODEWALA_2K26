package com.abstracts.interfaces;

public abstract class Product
{
	 public String productName;
	 public String productId;
	 public int price;
	 public int productLocation;
	 
	 
	 public void productDetails() {
		 System.out.println("Product Name :- " + productName);
	 }
	 
	 abstract void productBrand();         // not implementations   abstract class
	 abstract void productType();

	 
}


class Electronic extends Product{

	@Override
	void productBrand() {
		System.out.println("Details All Electronic Product");
		
	}

	@Override
	void productType() {
		System.out.println("Details all Data");
		
	}
	
}


class Cloth extends Product{

	@Override
	void productBrand() {
		System.out.println("");
		
	}

	@Override
	void productType() {
		System.out.println();
		
	}
	
}

class Payment extends Product{

	@Override
	void productBrand() {
		System.out.println();
		
	}

	@Override
	void productType() {
		System.out.println();
		
	}
	
class Driver {
	public static void main(String[] args) {
		
		Product product  = new Electronic();
		product.productDetails();
		product.productBrand();
		
	}
}
	
}
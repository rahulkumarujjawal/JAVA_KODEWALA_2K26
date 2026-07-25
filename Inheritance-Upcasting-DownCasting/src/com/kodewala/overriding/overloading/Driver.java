package com.kodewala.overriding.overloading;

public class Driver {
	public static void main(String[] args) {
//		Clothing clothing = new Clothing();
//		clothing.productDeatils();
//		clothing.productDeatils();
		
		
		Object object = new ObjectFactory().getObject("Clothig Prduct");
		
		Product product = (Product) object;
	
		product.productDeatils();
		
		
		
		
		
	}

}

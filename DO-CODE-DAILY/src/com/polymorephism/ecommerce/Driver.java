package com.polymorephism.ecommerce;

public class Driver {
	public static void main(String[] args) {
		ProductProcessor processor = new ProductProcessor();
		
		
		ElectronicProduct electronic = new ElectronicProduct();
		ChildClothes child  =  new ChildClothes();
		
		DmartProduct mart = new DmartProduct();
		ProductPayment productpayment =  new ProductPayment();
		
		
		
		processor.ProductAdding(electronic);
		processor.ProductAdding(child);
		processor.ProductAdding(mart);
		
		processor.ProductAdding(productpayment);
		
		
		
		
	}

}

package com.polymorephism.ecommerce;

public class Product 
{
	public void productAdded() {
		System.out.println("Product.productAdded().......Sucessfully..");
		
	}

}






class ElectronicProduct  extends Product

{
	@Override
	public void productAdded() 
	{
		System.out.println("ElectronicProduct.productAdded().......Sucessfully..");
		
	}

	
}





class MensProduct extends Product
{
	
	@Override
	public void productAdded() 
	{
		System.out.println("Product. MensproductAdded().......Sucessfully..");
		
	}

}




class WomensProduct extends Product
{
	@Override
	public void productAdded() 
	{
		System.out.println("Product. WomensProductAdded().......Sucessfully..");
		
	}
	
	
}






class ChildClothes extends Product {
	
	@Override
	public void productAdded() 
	{
		System.out.println("Product. ChildClothesProductAdded().......Sucessfully..");
		
	}
	
}






class DmartProduct extends Product
{
	@Override
	public void  productAdded() 
	{
		System.out.println( "Product.DmartProduct()....SucessFully..");
	}
}



class ProductPayment extends Product
{
	
	
	@Override
	public void  productAdded() 
	{
		System.out.println( "Product.Payment....SucessFully..");
	}	
	
}





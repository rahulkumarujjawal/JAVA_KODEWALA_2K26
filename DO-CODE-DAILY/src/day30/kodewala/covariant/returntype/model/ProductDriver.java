package day30.kodewala.covariant.returntype.model;

class Product {
	public Product getDetails() {
		System.out.println("Product Details");
		return new Product();
		
	}
	
}
class Mobile extends Product{
	
	@Override
	public Mobile getDetails()
	{
		super.getDetails();
		System.out.println("Mobile details");
		return new Mobile();
		
	}
	
}

class Laptop extends Mobile{
	@Override
	public Laptop getDetails() 
	{
		super.getDetails();
		System.out.println("Laptop details ");
		return new Laptop();
		
	}
	
}

class Watch extends  Laptop{
	
	@Override
	public Watch getDetails() {
		super.getDetails();
		System.out.println("Watch Details");
		return new Watch();
		
	}
	
}

public class ProductDriver {
	public static void main(String[] args) {
		Watch watch = new Watch();
		watch.getDetails();
		
		
	}

}

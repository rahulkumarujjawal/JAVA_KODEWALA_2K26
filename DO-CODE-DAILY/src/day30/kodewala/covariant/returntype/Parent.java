package day30.kodewala.covariant.returntype;

class Product {
	
 public	Product detailsProducts() {
		System.out.println("Learn Coding");
		// return this;
		return new Product();
	}

}

class Cloth extends Product {
	
@Override
public	Cloth detailsProducts() {
	
	
		super.detailsProducts();   
		System.out.println("DO like and shared ");
		// return this;
		return new Cloth();
	}
}

public class Parent {
	public static void main(String[] args)    {
		Cloth cloth = new  Cloth();
		cloth.detailsProducts();
	}

}







/*  When  override  the method, the written type can be same?
 *  method can return any Valid objects.  types
 * 
 */

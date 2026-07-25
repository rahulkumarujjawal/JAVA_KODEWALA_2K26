package day31.kodewala.ploymorephims;

class Product {
	public void productDetails(String name, int price, String Color) { // static methods are hiiden in child class
		System.out.println("Product Details(String name, int price ,String Color)");
	}

}

class ElectronicProduct extends Product {
	public void productDetails(String name, int price, String Color) {
		System.out.println("productDetails(String source, String Destination)"); // static methods are hiiden in child
																				// class
	}

}

public class Driver2 {
	public static void main(String[] args) {
		Product product = new ElectronicProduct();
		product.productDetails("Mobile", 55565, "Black");
	}

}

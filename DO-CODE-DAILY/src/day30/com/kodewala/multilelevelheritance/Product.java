package day30.com.kodewala.multilelevelheritance;

class Product {

	public void productdetails() {
		System.out.println("Product Available on Amazon");

	}

}

class Electronic extends Product {
	public void warrentyProducts() {
		System.out.println("Warrenty  :- 2 years");
	}

}

class Laptop extends Electronic {

	public void specification() {
		System.out.println("16 gb ram ");
		System.out.println("512 gb ram");
	}
}

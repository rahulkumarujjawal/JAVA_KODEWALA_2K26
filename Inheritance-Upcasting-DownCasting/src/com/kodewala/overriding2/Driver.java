package com.kodewala.overriding2;

class Customer {
	private void showDetails() { // private
		System.out.println("Customers.show details");
	}

	// this method can be reused in the child classes OR if child classes want to modify  the 
	// functionalities of this method , they are free to  do so 
	public void calculateOrder() {
		System.out.println("Customer.calclulatePrice()");
	}
	
	
}

class GoldCustomer extends Customer {

	@Override
	public void calculateOrder() {
		System.out.println("GolCustomer.CalculatePrice()"); // logic
		// need to follow rules and reguations
	}
	

}

public class Driver {

	public static void main(String[] args) {
		GoldCustomer gold = new GoldCustomer();
		gold.calculateOrder();

	}

}

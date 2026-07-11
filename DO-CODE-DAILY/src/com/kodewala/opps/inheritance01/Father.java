package com.kodewala.opps.inheritance01;

public class Father {
	String name;
	String color;
	int age;
	String Location;
	int balance;

	Father() {
		System.out.println("i am your Father");  // default contractor 

	}

	Father(String _name) {
		this.name = _name;
		System.out.println("i am your Boss rahul ujjawal sharma \n"); // Parameterize contractor

	}

	public void fatherDetails() {
		System.out.println("Boos is mood On ");
	}

}

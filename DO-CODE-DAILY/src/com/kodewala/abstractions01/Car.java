package com.kodewala.abstractions01;

abstract class Car {
	abstract public void fuleType();

	public void color() {
		System.out.println("Black Color");
	}

}

 class Tata extends Car {
	public void fuelType() {
		System.out.println("Petrol");
	}

	@Override
	public void fuleType() {

	}
}

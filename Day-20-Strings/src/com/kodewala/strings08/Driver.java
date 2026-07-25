package com.kodewala.strings08;

class Animals {
	public void sound() {
		System.out.println("Animals makes a sound");
	}
}


class Dog extends Animals {
	@Override
	public void sound() {
		System.out.println("Dogs Barks");
	}
}

class Cat extends Animals {
	@Override
	public void sound() {
		System.out.println("mewos mewos");
	}
}

public class Driver {

}

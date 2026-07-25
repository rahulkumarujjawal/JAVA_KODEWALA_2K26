package com.kodewala;

public class Cat {

	private String name;
	private float wight;
	private int age;
	private int years;

	public static void main(String[] args) {
		System.out.println("WELCOME MAIN METHOD()....");

		Cat.employeeDeatils("RAHUL UJJAWAL UJJAWAL ",75, 23, 2026);

	}

	public static void employeeDeatils(String name, float weight, int age, int years) {
		
	    System.out.println("---------------------------------------------");

		System.out.println("Enter Your Name :- " + name);
		System.out.println("Enter Your Wight :- " + weight);
		System.out.println("Enter your Age :- " + age);
		System.out.println("Enter Your Years :-  " + years);
		System.out.println("----------------------------------------------");

		

	}
}

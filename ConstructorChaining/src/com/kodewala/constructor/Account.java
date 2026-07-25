package com.kodewala.constructor;

public class Account extends Driver {

	private int id;
	private String name; // filed or attribute or data or varaibles
	private int balance; // filed or attribute or data or varaibles

	private String location;
	private int age;

	Account() {
		// 1 st line of constructor
		this("rahul ujjawal", 75000); // calling the account class constructor

		// new account ("rahul ujjawal", 75000);
		// this call same class constructor
		// super will call parents class
		System.out.println("Default Constructor Called");

	}

	Account(String _name, int _balance) {   
		super(); // object class constructor
		this.name = _name;
		this.balance = _balance;
		System.out.println("2 Parameter Constructor Called");

	}
	

	Account(int _balance, String _name) {
		this.name = _name;
		this.balance = _balance;
		System.out.println("3 Parameter Constructor Called");
	}

	Account(int _id, String _name, String _location, int _age) {
		this.id = _id;
		this.name = _name;
		this.location = _location;
		this.age = _age;
		System.out.println("4 Parameter Constructor Called");
	}

	Account(int _id, int _age) {
		this.id = _id;
		this.age = _age;
		System.out.println("5 Parameter Constructor Called");

	}

	public void userDetail() {
		System.out.println("----------------------------");
		System.out.println("Id       : " + id);
		System.out.println("Name     : " + name);
		System.out.println("Balance  : " + balance);
		System.out.println("Location : " + location);
		System.out.println("Age      : " + age);
	}
}

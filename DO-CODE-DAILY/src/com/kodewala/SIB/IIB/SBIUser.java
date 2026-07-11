package com.kodewala.SIB.IIB;

public class SBIUser extends SbiBank {  // child class 

	// Static Variable
	static int objectCount = 0;

	// Instance Variables
	String name;
	String userId;
	int balance;

	// Static Initialization Block
	static {
		System.out.println("SIB : SBIUser Class Loaded");
	}

	// Instance Initialization Block
	{
		objectCount++;
		System.out.println("IIB : SBIUser Object Created = " + objectCount);
	}

	// Default Constructor
	SBIUser() {

		this("Unknown", "NA", 0);

		System.out.println("Default Constructor");
	}

	// Parameterized Constructor
	SBIUser(String name, String userId, int balance) {

		super("Bangalore"); // Parent Constructor

		this.name = name; // Current Object
		this.userId = userId;
		this.balance = balance;

		System.out.println("Parameterized Constructor");
	}

	// Method
	void display() {

		System.out.println("-------------------------");

		System.out.println("Name : " + name);
		System.out.println("User Id : " + userId);
		System.out.println("Balance : " + balance);

		bankDetails(); // Parent Method
	}

	public static void main(String[] args) {

		System.out.println("Main Started");

		SBIUser u1 = new SBIUser("Rahul", "rahul123", 5000);

		SBIUser u2 = new SBIUser("Amit", "amit123", 9000);

		SBIUser u3 = new SBIUser();

		u1.display();

		u2.display();

		u3.display();

		System.out.println("-------------------------");

		System.out.println("Total Objects = " + objectCount);

		System.out.println("Main End");
	}

}

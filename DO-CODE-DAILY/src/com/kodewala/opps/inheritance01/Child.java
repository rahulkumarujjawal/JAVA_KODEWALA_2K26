package com.kodewala.opps.inheritance01;

public class Child extends Father {

	int income;

	public void fatherDetails() { // this is curerent implementation
		super.fatherDetails();
		System.out.println(this);
		// System.out.println(this.model + "Boos is mood On "); // find the which object
		// will be call
	}

	Child() {
		super("RAHUL"); // here parents constructor call here if here not add values by default printed
		System.out.println("==============================="); // calling here parents Constructor
	}

	public static void main(String[] args) {

		// Father boos = new Father();

		Child child = new Child();
		child.name = "Ujjawal sharma";

		child.age = 22;
		child.color = "white";
		child.income = 55000;
		child.Location = "Benglore";
		child.fatherDetails();

		System.out.println(child.name);

		System.out.println("Age :- " + child.age);
		System.out.println("Color :- " + child.color);
		System.out.println("Income :- " + child.income);
		System.out.println("Location :- " + child.Location);
		System.out.println(child.name);

	}

}

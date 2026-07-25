 package com.kodewala.constructor;

public class Driver {
	public static void main(String[] args) {

		Account object1 = new Account();

		Account object2 = new Account("Rahul Ujjawal", 450000);
		Account object3 = new Account(80000, "Vikash Kumar");

		Account object4 = new Account(101, "Amit Sharma", "Bangalore", 24);

		Account object5 = new Account(102, 30);

		object1.userDetail();
		object2.userDetail();
		object3.userDetail();
		object4.userDetail();
		object5.userDetail();

	}

}

package com.amazon.user.mgmt;

public class User extends UserMgmt {    // user child class 
	public static void main(String[] args) {
		User user =  new User();
		//  User class is reusing the properties of… It's… Parent. Class.  User management. 
		
		
		System.out.println("============AMAZON==========");
		System.out.println("Type :- " + user.type);
		System.out.println("Your Loctaion :- " + user.loctation);
		System.out.println("Your Item :- " + user.item);
		System.out.println("Your Price :- "+user.price);
		System.out.println("Your Mobile number :- " +user.mobileNumber);
		System.out.println("quantity :- " + user.quantity );
		user.doSomething();
		
		System.out.println("============Thank you ! !=======");

	}

}

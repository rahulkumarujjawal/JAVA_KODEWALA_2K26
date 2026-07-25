package com.kodewala.metro.user;

import java.security.PublicKey;

public class MetroUser {

	private int userId;
	private String name;
	private int age;
	private String source;
	private String destination;
	private long mobileNumbers;

	MetroUser() {
		System.out.println("No Argument Constructor Called 001");
	}

	MetroUser(int userId) {
		this.userId = userId;
		System.out.println("userId Constuctor Called 002");
	}

	MetroUser(String name) {
		this.name = name;
		System.out.println("name Constructor called  003");

	}

	MetroUser(String Name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Name and age Constroctor Called  004");
	}

	MetroUser(String source, String destination) {
		this.source = source;
		this.destination = destination;
		System.out.println("source and destination Constuctor  Called 005");

	}

	MetroUser(long mobileNunbers) {
		this.mobileNumbers = mobileNunbers;
		System.out.println("Mobile Numbers Constuctor is called 006");

	}

	MetroUser(int userID, String name, int age, String source, String destination, long mobileNumbers) {
		this.userId = userID;
		this.name = name;
		this.age = age;
		this.source = source;
		this.destination = destination;
		this.mobileNumbers = mobileNumbers;

		System.out.println("Full ConstructoR is CALLED 007");

	}

	public void metroUserDetails() {
		System.out.println("____________________________");
		System.out.println("User Id         :- " + userId);
		System.out.println("Name            :- " + name);
		System.out.println("Age             :- " + age);
		System.out.println("source          :- " + source);
		System.out.println("Destination     :- " + destination);
		System.out.println("Mobile Numbers  :- " + mobileNumbers);
	}

	public static void main(String[] args) {

		System.out.println("--------------------------------");
		System.out.println("----Welcome to Metro Railway-----");
		System.out.println("--------------------------------");

		System.out.println("Main method will satart .. ! ! ");

		MetroUser user1 = new MetroUser();
		MetroUser user2 = new MetroUser(1024);
		MetroUser user3 = new MetroUser("Rahul Ujjawal Sharma");
		MetroUser user4 = new MetroUser("Rahul ujjjawal", 22);
		MetroUser user5 = new MetroUser("Ranchi", "Bneglore");
		MetroUser user6 = new MetroUser(9700838322l);
		MetroUser userDetails = new MetroUser(102, "rahul ujjawal", 22, "Ranchi", "Benglore", 8709949334l);

		user1.metroUserDetails();
		user2.metroUserDetails();
		user3.metroUserDetails();
		user4.metroUserDetails();
		user5.metroUserDetails();
		user6.metroUserDetails();
		userDetails.metroUserDetails();

		System.out.println("--------------------------------");
		System.out.println("----------Thank You ! !---------");
		System.out.println("--------------------------------");

		System.out.println("--------------------------------");
		System.out.println("----------Visit Again ! !--------");
		System.out.println("--------------------------------");

		System.out.println("Main method End().. ! ! ! ");

	}

}

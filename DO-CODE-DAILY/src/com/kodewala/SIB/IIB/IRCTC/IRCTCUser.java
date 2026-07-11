package com.kodewala.SIB.IIB.IRCTC;

public class IRCTCUser {

	static String appName = "IRCTC booking app ";

	private String name;
	private String source;
	private String Destination;
	private int age;
	private int mobileNumbers;

	static {

		System.out.println("==================================");
		System.out.println("IRCTC Application Starting...");
		System.out.println("Loading Train Database...");
		System.out.println("Connecting to Railway Server...");
		System.out.println(" welcome to irctc app");
		System.out.println("Application Name : " + appName);
		System.out.println("==================================");
	}

	IRCTCUser(String name, String source, String destination, int age, int mobileNumbers) {
		this.name = name;
		this.source = source;
		this.Destination = destination;
		this.age = age;
		this.mobileNumbers = mobileNumbers;

		System.out.println("User Object Created");

	}

	void bookTickets() {
		System.out.println("-----------------------------");
		System.out.println("Passenger Name : " + name);
		System.out.println("Source         : " + source);
		System.out.println("Destination    : " + Destination);
		System.out.println("Ticket Booked Successfully");
	}
}
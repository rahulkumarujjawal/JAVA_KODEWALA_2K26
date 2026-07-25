package com.kodewala.ExploreOrderOfExecution;

public class OrderOfExecution {

	public int userId;
	public String Name;
	public String Location;
	public int mobileNumbers;
	public int age;

	static {
		System.out.println("Class Loaded");
	}
	
	

	public OrderOfExecution() {
		System.out.println("This is without argumnets Constroctor"); //
	}



	public OrderOfExecution(int userId, String name) {
		System.out.println("This is  with argumnets Constroctor"); //
	}

	public OrderOfExecution(int userId, String name, String Location) {
		System.out.println("This is  with argumnets Constroctor"); //
	}

	public OrderOfExecution(int userId, String name, String Location, int mobileNumbers) {
		System.out.println("This is  with argumnets Constroctor"); //
	}
	
	public OrderOfExecution(String Name) {
		this.Name = Name;
		System.out.println("Enter the Name");
		
	}
}

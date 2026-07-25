package com.kodewala.strings09;

public class Driver {
	public static void main(String[] args) {
		
//		String name = "Rahul kumar"; // new object created and no reference
//		name.concat("ujjawal");
//		System.out.println(name); // rahul kumar
//		
//		
		
		
		
		
		
		
		StringBuilder stringBuilder = new StringBuilder("Rahul ");// --
		
		stringBuilder.append("ujjawal "); // " Rahul kumar ujjawal" no new object created
//		System.out.println(stringBuilder);
		stringBuilder.append("From Benglore");
		System.out.println(stringBuilder);
	}

	
	
}

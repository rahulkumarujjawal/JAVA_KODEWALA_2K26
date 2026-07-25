package com.kodewala.strings01;

public class User {
	public static void main(String[] args) {

/* using literals one of the way to create string object java check if any object with content("benglore ")
 * exists in String Constent pool(scp) if exists then  no objetcs crrated and it start 
*/		

		String productName = "APPLE"; // one object in scp 
		String CITY = "DELHI";
		String productCountry = "USA";
		String p = "apple";

		String name = "Rahul";
		String lastName = "ujjawal";
		String Location = "Benglore";
		String nam = "Rahul";

		
		System.out.println(name == nam);
		System.out.println(CITY == p);

	}

}

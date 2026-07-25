package com.kodewala.array1;

public class Driver {
	public static void main(String[] args) {
		String name[] = { "rahul", "ujjawal", "", "sharma", "raju", "", "", "", "chhaya", "rani" };
		// processing the convert the products to upper case (rahul ------> RAHUL

		for (int index = 0; index < name.length; index++) {
			String nam = name[index];
			if (nam.isEmpty()) {
				continue; // skip the cureent iternations
			}
			System.out.println(nam.toUpperCase());

		}
	}
}

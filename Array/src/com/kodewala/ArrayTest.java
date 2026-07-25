package com.kodewala;

public class ArrayTest {
	public static void main(String[] args) {
		int[] employeAge = { 10,12,16,18,20,22, 34, 25, 78, 45, 30, 40, 70 };
		for (int index = 0; index < employeAge.length; index++) {
			int age = employeAge[index];
			if (age > 22) {
				continue;

			}
			System.out.println("-----------------------");
			System.out.println("Your age  is " + age);
			System.out.println("------------------------");

		}
	}

}

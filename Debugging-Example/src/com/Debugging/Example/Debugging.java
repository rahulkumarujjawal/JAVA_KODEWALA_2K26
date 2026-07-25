package com.Debugging.Example;

public class Debugging {
	public static void main(String[] args) {
		int firstNumber = 60;
		int secondNumber = 20;

		int sum = addNumbers(firstNumber, secondNumber);
		System.out.println("Total number :- " + sum);
	}

	private static int addNumbers(int num1, int num2) {
		int sum = num1 + num2;
		return sum;

	}
}

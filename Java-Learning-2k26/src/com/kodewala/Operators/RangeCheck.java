package com.kodewala.Operators;

public class RangeCheck {
	public static void main(String[] args) {
		int numbers[] = { 5, 15, 20, 25, 30, 30, 45, 50, 60, 80 };
		for (int index = 0; index < numbers.length; index++) {
			if(numbers[index] < 10 || numbers[index] >50) {
				System.out.println(numbers[index]);
			}

		}
	}

}

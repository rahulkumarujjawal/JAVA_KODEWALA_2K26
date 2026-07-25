package com.kodewala.arraybreak;

public class ArrayBreak {
	public static void main(String[] args) {
		int[] numbers = { 10, -20, 30, -40, 50, -60, 70, 80, -45, 100, 50 };
		for (int i = 0; i < numbers.length; ++i) {
			int num = numbers[i];

			if (num < 0) {
				System.out.println("NUMBER IS NEGATIVE:-  " + num );
				break;

			}
			System.out.println("THIS IS  POSSITIVE NUMBERS :- " + num);
		}

	}
}




 
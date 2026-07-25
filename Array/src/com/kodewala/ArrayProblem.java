package com.kodewala;

public class ArrayProblem {

	public static void main(String[] args) {
		ArrayProblem.elementArray();
	}

	public static void elementArray() {

		int numbers[] = new int[12];

		numbers[0] = 2;
		numbers[1] = 4;
		numbers[2] = 1;
		numbers[3] = 5;
		numbers[4] = 6;
		numbers[5] = 18;
		numbers[6] = 95;
		numbers[7] = 43;
		numbers[8] = 21;
		numbers[9] = 2345;
		numbers[10] = -23;
		numbers[11] = -31;

		boolean isNegative = false;

		for (int i = 0; i < numbers.length; i++) {

			int number = numbers[i];

			if (number < 0) {
				isNegative = true;
				break;
			}
		}

		if (isNegative) {
			System.out.println("Array is Negative");
		} else {
			System.out.println("Array is Positive");
		}
	}
}

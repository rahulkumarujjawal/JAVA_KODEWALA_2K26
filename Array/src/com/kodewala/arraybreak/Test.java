package com.kodewala.arraybreak;

public class Test {
	public static void main(String[] args) {
		int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80, 100, 60, 79, 80 };
		for (int index = 0; index < numbers.length; index++) {
			int num = numbers[index];
			
			if(num >= 70) {
				System.out.println("you have passed:- " +num);
				
			}else {
				System.out.println("you  have  Fail :- " + num);
			}

		}

	}

}

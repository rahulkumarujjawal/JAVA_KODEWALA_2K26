package com.kodewala.array;

import java.util.Iterator;

public class Driver {
	public static void main(String[] args) {
		int numbers[] = { 10, 20, 30, -50, 60, -70, 80, -90, -100, 110, -20, -40, 10, -95, 87 };

		for (int index = 0; index < numbers.length; index++) {
			int num = numbers[index];
			if (num < 0) {
				System.out.println("Given array is -v3");
				break; // exit from the lopp /block 
				
//it will improve the performance. Whenever they are asking you to write your program, always try to use break, wherever possible. 

			}
            System.out.println("executing......");
		}

	}

}

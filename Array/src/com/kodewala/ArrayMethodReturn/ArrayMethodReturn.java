package com.kodewala.ArrayMethodReturn;

public class ArrayMethodReturn {
	public static void main(String[] args) {
		int[] Number = { 10, 20, 40, 50, 60, 60, 70, 60 };
		for (int index = 0; index < Number.length; index++) {
			int num = Number[index];
			if (index < 60) {
				System.out.println();
			}
		}
	}

}

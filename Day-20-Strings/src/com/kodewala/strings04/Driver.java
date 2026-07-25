package com.kodewala.strings04;

public class Driver {
	public static void main(String[] args) {
		String text = " rahull ujjawwaal"; // char at index number 0 ;
		char[] inputArr1 = text.toCharArray();
		for (int i = 0; i < inputArr1.length; i++) {
			char currentChar = inputArr1[i];

			if (text.indexOf(currentChar) == text.lastIndexOf(currentChar)) {
				System.out.println(currentChar);
				break;
			}
		}

	}

}
//  non repting and  and repting String  -- String  class is final class 

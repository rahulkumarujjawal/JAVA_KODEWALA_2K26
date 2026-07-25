package com.kodewala;

public class ArrayExp {
	public static void main(String[] args) {
		ArrayExp.storeElements();
	}

	public static void storeElements() {
		// creating an aaray (Creating a container -size = 10 elemnts , type : int

		int balance = 1000;
		int marks[] = new int[10];// creating an array o fint which will hold 10 elemenst.
		
		// add an elementsto an array
		marks[0] = 23;
		marks[1] = 45;

		marks[2] = 89;

		marks[3] = 22;
		marks[4] = 11;

		
		int firstElement =  marks[0];
		// how to read an elements 
		System.out.println(firstElement);
		



		// String name[] = new String[20]; // creating an array of String which will hold 20 elements

	}
}

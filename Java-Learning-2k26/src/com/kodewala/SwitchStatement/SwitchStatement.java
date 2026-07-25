package com.kodewala.SwitchStatement;

public class SwitchStatement {
	public static void main(String[] args) {
		char grade = 'g';

		switch (grade) {

		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Very Good");
			break;
		case 'C':
			System.out.println("GOOD");
			break;
		case 'D':
			System.out.println("Average ");
			break;
		case 'E':
			System.out.println("below  Average");
			break;
		case 'F':
			System.out.println("Very pore");
			break;
		case 'G':
			System.out.println("Baklol stundent");
			break;

		default:
			System.out.println("Invalid Grade");
		}
	}

}

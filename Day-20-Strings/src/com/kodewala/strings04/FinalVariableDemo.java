package com.kodewala.strings04;

public class FinalVariableDemo {

	final int MAX_STUDENTS = 100;

	public void totalStudent() {
		System.out.println("Maximum Students : " + MAX_STUDENTS);

		// MAX_STUDENTS = 200; // Compile Time Error
	}

	public static void main(String[] args) {
		FinalVariableDemo obj = new FinalVariableDemo();
		obj.totalStudent();

	}
}
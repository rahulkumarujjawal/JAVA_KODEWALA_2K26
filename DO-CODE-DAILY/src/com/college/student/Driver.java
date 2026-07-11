package com.college.student;



public class Driver {

	public static void main(String[] args) {
		Student student = new Student();
		
		
		student.setName("rahul ujjawal");
		student.setAge(22);
		student.setroll_number(1234);
		
		System.out.println("Your Name :- " + student.getName());
		System.out.println("Your Age :-  "  + student.getAge());
		System.out.println("Your Roll-Number :- " +student.getroll_number());
		

	}

}

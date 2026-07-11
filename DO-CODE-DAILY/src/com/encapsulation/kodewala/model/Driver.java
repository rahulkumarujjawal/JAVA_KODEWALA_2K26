package com.encapsulation.kodewala.model;

public class Driver {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Rahul ujjawal");
		student.setFatherName("oojsojsojso2jsd");
		student.setAge(22);
		student.setLocation("benglore");
		student.setRoll_numbers(101);
		
		System.out.println(student.getName());
		System.out.println(student.getFatherName());
		System.out.println(student.getAge());
		System.out.println(student.getLocation());
		System.out.println(student.getRoll_numbers());
		
		
	}

}

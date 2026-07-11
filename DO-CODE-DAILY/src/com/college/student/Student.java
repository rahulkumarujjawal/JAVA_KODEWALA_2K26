package com.college.student;

public class Student {
	private String name;
	private int age;
	private int roll_number;

	public String getName() {
		return name;

	}

	public int getAge() {
		return age;
	}

	public int getroll_number() {           // normal method 
		return roll_number;
	}

	public void setName(String _name) {
		this.name = _name;

	}

	public void setAge(int _age) {
		this.age = _age;

	}

	public void setroll_number(int _roll_number) {
		this.roll_number = _roll_number;
	}

}

package com.encapsulation.kodewala.model;

public class Student {

	// Make all instance variables private.
	private String name;
	private String fatherName;
	private int age;
	private int roll_numbers;
	private String Location;

	// Create getter setter methods.

	public String getName() {
		return name;
	}

	public String getFatherName() {
		return fatherName;
	}

	public int getAge() {
		return age;
	}

	public int getRoll_numbers() {
		return roll_numbers;
	}

	public String getLocation() {
		return Location;
	}

	// setter methods.

	public void setName(String _name) {
		this.name = _name;
	}

	public void setFatherName(String _fatherName) {
		this.fatherName = _fatherName;
	}

	public void setAge(int _age) {
		if (age > 18) {
			this.age = _age;

		} else {
			System.out.println("Inavlaid age ");
		}
	}

	public void setRoll_numbers(int _roll_numbers) {
		this.roll_numbers = _roll_numbers;
	}

	public void setLocation(String _location) {
		Location = _location;
	}

}

package com.kodewala.inheritance.typecasting;

public class Employee {

}

class Manager extends Employee { // Manager IS-A Employee

}

class Driver {

	public static void main(String[] args) {
		Manager manager = new Manager(); // same class is referring, same class, object?
		int a = 10;

		// up casting
		Employee employee = (Employee) new Manager(); // but here not required (Employee) parent to child
		/*
		 * super/parent class can refer child class object The condition for this? It
		 * should be parent and child. It should be… Parent and child. There should be
		 * Relationship
		 * 
		 * parent class can refer child class object The condition -- this is called
		 * AutoType Casting
		 * 
		 */
		
		
		// now child class refer the parent class object :-

		// Manager manager1 = new Employee(); // Employee(); this is a parent class
		// objects -- this is a error
		// child class cannot refer. Parent class.

		// Manager manager1 = this is a child class Parent is bigger than the child,

		Manager manager1 = (Manager) new Employee(); // this is called Down-CASTING (Manager) new Employee();
		// here required write in child class to parent class

	}
}

package com.kodewala.upcastingdownCasting;

public class Employee {

	
}

 
class Manager extends Employee{   // Manager IS-A Employee
	public static void main(String[] args) {
		Manager manager = new Manager();
		int       a = 1000;
		
		// up casting 
		 
		Employee employee =    (Employee) new Manager(); // SUPER /  parent class can refer child class object 
		
		// let child class refer the parent classs object 
		Manager manager2 =  (Manager) new  Employee();
	}
}
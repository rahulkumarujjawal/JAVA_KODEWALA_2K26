package com.tcs.employee.login;

public class Employee {
	int empId = 101;
	String empName = "Rahul Ujjawal";

	public void employeeLogin(int _empId, String _empName) {
		if (this.empId == _empId  && this.empName.equalsIgnoreCase(_empName)) {
			System.out.println("Login Sucessfully");

		} else {
			System.out.println("Invalid id and Password");
		}

	}
}

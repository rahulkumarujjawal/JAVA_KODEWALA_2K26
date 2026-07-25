package com.model.employee;

public class Employee {
	 public  int  employeeID;
	 public String empName;
	 public String location;
	 public double salary;
	 public long mobileNumber;

	
	// constractor
	public Employee(int _employeeID, String _empName, String _Location, double _salary, long _mobileNumber) {
		this.employeeID = _employeeID;
		this.empName = _empName;
		this.location = _Location;
		this.salary = _salary;
		this.mobileNumber = _mobileNumber;
	}

	// Methods
	public void employeeLogin() {
		System.out.println("Login into the compay Portal :- " + empName);
	}

	public void employeeLogout() {
		System.out.println("Logout the SucessFully :- " + empName);
	}

	public void empDetails() {
		System.out.println("=========Employee Details=======");
		System.out.println("Employee Id :- " + employeeID);
		System.out.println("Employee Name :- " + empName);
		System.out.println("salary :- " +         salary);
		System.out.println("Mobile Number :- " + mobileNumber);
	}
}

package com.kodewala.model;

import java.security.PublicKey;

public class Employee {
	private int empId;
	private String empName;
	private int salary;
	private String department;

	public Employee(int _empId, String _empName, Integer  _salary, String _department) {
		this.empId = _empId;
		this.empName = _empName;
		this.salary = _salary;
		this.department = _department;

	}

	public int getempId() {
		return empId;

	}

	public String getempName() {
		return empName;

	}

	public int getsalary() {
		return salary;

	}

	public String getdepartment() {
		return department;
	}
}

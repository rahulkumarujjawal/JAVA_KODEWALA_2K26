package com.model.Developer;

import com.model.employee.Employee;

public class Developer extends Employee {
	public String jobRole;

	public String  projectName;

	public Developer(int _employeeID, String _empName, String _Location, double _salary, long _mobileNumber,
			String _jobRole, String _projectName) {
		super(_employeeID, _empName, _Location, _salary, _mobileNumber);
		this.jobRole = _jobRole;
		this.projectName = _projectName;

	}

	public void employeeWriteCode() {
		System.out.println("Handle the java Backend dev Code :- " + empName);
	}

	public void debugCode() {
		System.out.println("Debug The Application :- " + empName);
	}

	public void detailsDeveloper() {
		System.out.println("===== Developer Details =====");
		System.out.println("Programming Language :- " + jobRole);
		System.out.println("Project Name  :> " + projectName);

	}
}

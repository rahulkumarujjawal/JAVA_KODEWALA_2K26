package com.driver;

import com.model.Developer.Developer;
import com.model.employee.Employee;

public class Driver {
	public static void main(String[] args) {
		Developer developer = new Developer(101, "Rahul Ujjawal", "Benglore", 7687.87, 8709949334l, "Java Developer",
				"E-commerence");
		System.out.println("===============================================");

		developer.employeeLogin();
		System.out.println("===============================================");

		developer.empDetails();
		System.out.println("===============================================");


		System.out.println("Employee Id :- " + developer.employeeID);
		System.out.println("Employee Name :- " + developer.empName);
		System.out.println("Employee Location :- " + developer.location);
		System.out.println("Employee Salary :- " + developer.salary);
		System.out.println("Job Role :- " + developer.jobRole);
		System.out.println("Project Name  :- " + developer.projectName);
		
		
		System.out.println("=================================================");


		developer.employeeWriteCode();
		
		System.out.println("==================================================");

		developer.debugCode();
		System.out.println("===================================================");

		developer.detailsDeveloper();
		System.out.println("==============================");

		developer.employeeLogout();

	}

}

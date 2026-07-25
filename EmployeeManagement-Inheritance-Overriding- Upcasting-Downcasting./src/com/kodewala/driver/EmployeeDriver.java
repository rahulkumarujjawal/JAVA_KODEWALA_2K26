package com.kodewala.driver;

import com.kodewala.model.Developer;
import com.kodewala.model.HR;
import com.kodewala.model.Tester;

public class EmployeeDriver {
	public static void main(String[] args) {

		Developer developer = new Developer(); // Developer Object

		developer.employeeLogin();
		developer.employeeDetailShow();

		developer.writeCode();
		developer.debugCode();
		developer.displayDeveloper();

		System.out.println("-----------------------------------");

		Tester tester = new Tester();
		// Tester Object

		tester.employeeLogin();
		tester.employeeDetailShow();

		tester.testApplication();
		tester.reportBug();
		tester.displayTester();

		System.out.println("-----------------------------------");

		HR hr = new HR(); // HR Object

		hr.employeeLogin();
		;
		hr.employeeDetailShow();

		hr.conductInterview();
		hr.approveLeave();
		hr.displayHR();

	}

}

package com.kodewala.model;

public class Employee {
	// Instance Variables
	
		int employeeId = 101;
		String employeeName = "Rahul Kumar ujjawal ";
		double salary = 65000;
		String companyName = "ABC Company";
		int age = 25;
		String officeLocation = "Benglore";
		String dateOfBirth = "99-jan-2000";
		
		
		// Methods
		
		public void employeeLogin() {                                                   // Methods ---- 01
			System.out.println(employeeName + "Login into the company portal.");
		}
		
		
		
		public void employeeLogout() {                                                  // Methods ---- 02
			System.out.println(employeeName + "Logout out successfully.");
		}
	  
		public void employeeDetailShow() {                                             // Methods ---- 03
			    System.out.println("\n===== EMPLOYEE DETAILS =====");
		        System.out.println("Employee ID   :- " + employeeId);
		        System.out.println("Employee Name :- " + employeeName);
		        System.out.println("Salary        :- " + salary);
		        System.out.println("Company       :- " + companyName);
		        System.out.println("Age           :- " + age);
		        System.out.println("Office Location:-" + officeLocation);
		        System.out.println("Date of Birth :- " + dateOfBirth);

		}

}

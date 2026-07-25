package com.abstracts.interfaces.payment;

public abstract class Payment {
	
	
	int employeeId;
	String employeeName;
	int age ;
	String location;
	int Salary;
	
	
	public Payment() {
		
		System.out.println("Payment  Contrucor");
	}
	
	public abstract void pay();
	public void recepit() {
		
	}

	
	public static void companyPoliy() {
		System.out.println("Company Policy");
	}
}

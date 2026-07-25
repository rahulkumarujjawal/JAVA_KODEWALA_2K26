package com.kodewala.driver;

import com.kodewala.model.Developer;
import com.kodewala.model.Employee;

public class MainDriver 
{
	
	public static void main(String[] args) 
	
	{
		System.out.println("========== NORMAL OBJECT ==========\n");
		
		Developer developer = new Developer();
		developer.employeeLogin();
		developer.employeeDetailShow();
		developer.employeeLogout();
		
		
       System.out.println("\n==============================\n");

       System.out.println("========== UPCASTING ==========\n");
       
       Employee employee = new Developer();
       employee.employeeLogin();
    
       employee.employeeDetailShow();
     //   employee.writeCode();          // Compile Time Error
       
       
       System.out.println("\n==============================\n");

       System.out.println("========== DOWNCASTING ==========\n");

       
       Developer dev =  (Developer) employee;
       
       
       dev.employeeLogin();
       dev.employeeDetailShow();
       dev.displayDeveloper();
       dev.debugCode();
       dev.employeeLogout();


	}

}

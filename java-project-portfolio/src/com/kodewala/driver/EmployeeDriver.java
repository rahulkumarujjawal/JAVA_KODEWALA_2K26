package com.kodewala.driver;

import com.kodewala.model.Employee;
import com.kodewala.service.QueryBuilder;


public class EmployeeDriver {
	
	public static void main(String[] args) {
		
		System.out.println("========☕==========================️");
		System.out.println("====================================");
		System.out.println("--------👇 String Buffer 👇--------");
        System.out.println("====================================");
		// Create Employee object using constructor
        Employee emp = new Employee(101, "RAHUL KUMAR UJJAWAL", 50000, "IT");

        // Create QueryBuilder object
        QueryBuilder builder = new QueryBuilder();

        // Call buildQuery() method
        String sql = builder.buildQuery(emp);

        // Print SQL Query
        System.out.println("Generated SQL Query:");
     
        
        
        
        
        
        System.out.println(sql);
		
	}

}

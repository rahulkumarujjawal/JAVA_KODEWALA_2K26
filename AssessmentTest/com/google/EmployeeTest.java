package com.google;

public class EmployeeTest
{
    public static void main(String args [])
    {
  
           // System.out.println(Employee.showPassword);                                                                                                         // PRIVATE MEMBERS
           Employee.showPassword();

        // Compilation Error


         System.out.println(Employee.employeeId);                                                                                                                          // DEFAULT MEMBERS 
         System.out.println(Employee.employeeName);
		 Employee.employeeDetails();

   

																																																	    // PROTECTED MEMBERS
        System.out.println(Employee.designation);
        System.out.println(Employee.projectName);
		 Employee.projectDetails();

     

  
        System.out.println(Employee.companyName);                                                                                                                       // PUBLIC MEMBERS
        System.out.println(Employee.salary);
		 Employee.companyDetails();

       
		
		
    }
}
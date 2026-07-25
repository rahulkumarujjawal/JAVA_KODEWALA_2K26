package com.google;
  
 class Employee{
        
	static int employeeId = 12345;                                                                                                                     // ---------- Default Variables
    static String employeeName = "Rahul kumar ujjawal sharma";
	
	
    private static int employeePassword = 10012;                                                                                           // ---------- Private Variables
    private static String bankPin = "5678";
	

	protected static String designation = "Software Engineer & java backend Developer";                                 // ----------Protected Variables
    protected static String projectName = "Banking Project";
	
	

    public static String companyName = "Google ";                                                                            	         // ----------Public Variables
    public static double salary = 990000;
	
	
	public static void showPassword()
    {
        System.out.println("Password :- " + employeePassword);
    }


      static void employeeDetails()                                                                                                                      //---------- Default Method
    {
        System.out.println("Employee ID :-  " + employeeId);
        System.out.println("Employee Name :-  " + employeeName);
    }

																																									      // ----------Protected Method
    protected static void projectDetails()
    {
        System.out.println("Designation : - " + designation);
        System.out.println("Project :- " + projectName);
    }

 
    public static void companyDetails()                                                                                                             // ---------- Public Method
    {
        System.out.println("Company :- " + companyName);
        System.out.println("Salary :- " + salary);
    }
	
	

}
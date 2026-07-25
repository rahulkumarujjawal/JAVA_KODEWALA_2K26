class EmployeeDetails03 {

    public static void main(String[] args) {

        String employee_Id = args[0];
        String first_Name = args[1];
        String last_Name = args[2];
        int emp_age = Integer.parseInt(args[3]);
        String emp_dateOfBirth = args[4];
        String emp_email = args[5];
        String emp_state = args[6];
        String emp_country = args[7];
        double emp_salary = Double.parseDouble(args[8]);


        System.out.println("Welcome to the Java_Code");


        System.out.println("EMPLOYEE DETAILS");
        System.out.println("----------------------------------");
        System.out.println("Employee Id   :- " + employee_Id);
        System.out.println("First Name    :- " + first_Name);
        System.out.println("Last Name     :- " + last_Name);
        System.out.println("Age           :-  " + emp_age);
        System.out.println("Date Of Birth :- " + emp_dateOfBirth);
        System.out.println("Email         :- " + emp_email);
        System.out.println("State         :- " + emp_state);
        System.out.println("Country       :- " + emp_country);
        System.out.println("Salary        :- " + emp_salary);
		
		
        System.out.println("----------------------------------");
        System.out.println("End main()");
		
		
		
    }
	
	
	
}
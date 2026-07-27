package com.functionaLInterfaces;

interface Student {
	String register(int id, String name, double marks, boolean passed);
}

public class IStudentDetails {
	private static int marks;

	public static void main(String[] args) {
		Student student = (_id,_name,_marks,_passed) ->{
			
			
			if(_id <=0) {
				return "Registration Failed : Invalid Student ID.";
			}
			
			if (_name == null || _name.trim().isEmpty()) {
				return "Registration Failed : Student name cannot be empty."; 
			}
			
			// Validate Marks
			if (_marks < 0 || _marks > 100) { 
			return "Registration Failed : Marks should be between 0 and 100."; 
			}
			// Check Pass/Fail 
			
			if (!_passed) {
				return "Registration Failed : Student has not passed the examination."; 
			}
			
		
		// Grade Calculation 
		
		String grade;
		
		if(marks >= 90) {
			grade = "A+";
		}else if (marks >= 80) { 
		 grade = "A"; 
		} else if (marks >= 70) {
			grade = "B"; 
			} else if (marks >= 60) { 
			grade = "C"; 
			} else { 
			grade = "D"; 
			
			}
		// Return Student Details 
		return """
				   ============================== 
                    Student Registration Successful 
                    ==============================  
                       Student ID : %d 
                       Student Name : %s 
                       Marks : %.2f 
                       Result : %s 
                       Grade : %s
                    ==============================
				
				""".formatted(_id, _name, _marks, _passed ? "PASS" : "FAIL", grade); 
		
	
	};
    System.out.println("----------------------------------------");
	System.out.println(student.register(101, "Rahul", 95.50, true)); 
	System.out.println(student.register(102, "Vikash", 78.50, true)); 
	System.out.println(student.register(103, "Amit", 45.00, false)); 
	System.out.println(student.register(-1, "Rohan", 88.00, true));
	System.out.println(student.register(105, "", 92.00, true)); 
	System.out.println(student.register(106, "Priya", 120.00, true));
	System.out.println("-------------------------------------------");
	
		
	}

}

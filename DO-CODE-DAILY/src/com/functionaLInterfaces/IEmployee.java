package com.functionaLInterfaces;

interface IEmployee1
{
	void addEmployee(String name, double salary);
	
}
public class IEmployee {
	public static void main(String[] args) {
		IEmployee1 employee = (name, salary) ->  {
			System.out.println("Employee Name :- " + name);
			System.out.println("Employee Salary :- " + salary);
			
			
		};
		employee.addEmployee("Rahul Ujjawal", 850000);
	}

}

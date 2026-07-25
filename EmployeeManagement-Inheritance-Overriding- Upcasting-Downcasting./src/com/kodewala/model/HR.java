package com.kodewala.model;

public class HR  extends Employee{
	String department = "Human Resource";
    int totalEmployees = 250;

    public void conductInterview() {
        System.out.println(employeeName + " is conducting interviews.");
    }

    public void approveLeave() {
        System.out.println(employeeName + " approved employee leave.");
    }

    public void displayHR() {

        System.out.println("\n===== HR DETAILS =====");
        System.out.println("Department      : " + department);
        System.out.println("Total Employees : " + totalEmployees);

    }

}

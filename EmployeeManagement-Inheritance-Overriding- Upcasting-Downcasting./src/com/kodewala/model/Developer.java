package com.kodewala.model;

public class Developer  extends Employee{
	
	// Developer Variables

    String programmingLanguage = "Java";
    String projectName = "E-Commerce";

    // Developer Methods

    public void writeCode() {
        System.out.println(employeeName + " is writing Java code.");
    }

    public void debugCode() {
        System.out.println(employeeName + " is debugging the application.");
    }

    public void displayDeveloper() {

        System.out.println("\n===== DEVELOPER DETAILS =====");
        System.out.println("Programming Language : " + programmingLanguage);
        System.out.println("Project Name         : " + projectName);

    }

}

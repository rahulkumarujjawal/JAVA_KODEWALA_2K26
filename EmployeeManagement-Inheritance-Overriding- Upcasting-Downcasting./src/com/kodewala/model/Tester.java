package com.kodewala.model;

public class Tester extends Employee  {

	   String testingTool = "Selenium";
	    String testingType = "Automation";

	    public void testApplication() {
	        System.out.println(employeeName + " is testing the application.");
	    }

	    public void reportBug() {
	        System.out.println(employeeName + " reported a bug.");
	    }

	    public void displayTester() {

	        System.out.println("\n===== TESTER DETAILS =====");
	        System.out.println("Testing Tool : " + testingTool);
	        System.out.println("Testing Type : " + testingType);

	    }

}

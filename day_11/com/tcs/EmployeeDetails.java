package com.tcs;

class Employee {
	  public static void main(String[] args) 
	{

    private static int id = 101;
   static String name = "Rahul ujjawal";
    static double salary = 50000;

    public static int age = 25;
    public static String location = "Bangalore";

    private static void displayId() {
        System.out.println("Id : " + id);
    }

    static void displayNameAndSalary() {
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }

    public static void displayAgeAndLocation() {
        System.out.println("Age : " + age);
        System.out.println("Location : " + location);
    }
	
}